package com.example.sixam;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

//import tms.iqgateway.TmsUserModule.UserEO;
//import tms.iqgateway.TmsUserModule.UserService;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:3000")
public class HomeController {
	
	@Autowired
	private RoleService roleServiceRef;
	
	@RequestMapping(value="/addrole", method=RequestMethod.POST)
	@CrossOrigin()
	public RoleEO addrole(@RequestBody RoleEO roleEO){			
		return roleServiceRef.addRole(roleEO);

	}
	
	  
	
	@RequestMapping(value="/deleterole", method=RequestMethod.POST)
	public void deleterole(@RequestBody RoleEO role){
		roleServiceRef.deleteRole(role.getRoleName());
	}
	
	@RequestMapping(value="/modifyrole", method=RequestMethod.POST)
	public int modifyrole(@RequestBody RoleEO role){
		 return roleServiceRef.modifyRole(role.getRoleName(), role.getRoleDescription());
	}
	  

	
	@GetMapping("/getall")
	public List<RoleEO> getAllRoles(){
		return roleServiceRef.getAllRoles();
	}
	
	
	
	//User Operations
	
	@Autowired
	private UserService userService;
	
	//For authorization purpose
	@Autowired
	JwtService jwtservice;
	
	// Add User
    @PostMapping("/addUser")
    @CrossOrigin
    public UserEO addUser(@RequestBody UserEO user) {
    	if(userService.getByUserName(user.getUsername())!=null){
    		  throw new RuntimeException("User already exists.");
    		
    	}
       return userService.addUser(user);

    }

    // Update User
    @PutMapping("/modifyUser")
    @CrossOrigin
    public void modifyUser(@RequestBody UserEO user) {
        userService.modifyUser(user);
    }

    // Delete User
    @DeleteMapping("/deleteUser")
    @CrossOrigin
    public void deleteUser(@RequestBody UserEO user) {
        userService.deleteUser(user.getUsername());
    }

    // Get User by Username
    @PostMapping("/get")
    @CrossOrigin
    public UserEO getUserByUsername(@RequestBody UserEO user) {
        return userService.getByUserName(user.getUsername());
    }

    // Login Validation
    @PostMapping("/login")
    public ArrayList<String>  validateLogin(@RequestBody UserEO user) {
    	
    	//Here we will provide jwt authentication and create a token , then send token back to front-end
    	
    	//step :- call JWT Service class and use generateKey function to generate token
    	
    	
    	String token =jwtservice.generateToken(user.getUsername());
    	
    	 String userName= user.getUsername().toUpperCase();
    	
        String roleName = userService.LoginValidation(userName, user.getPassword());
        if (roleName != null && token !=null) {
        	
        	ArrayList<String> userdata = new ArrayList<>();
        	
        	userdata.add(roleName);
        	userdata.add(token);
        	
            return userdata;
        } else {
        	throw new ResponseStatusException(HttpStatus.NO_CONTENT, "User Doesn't exist");
        }
    }
    
    @GetMapping("/roles")
    @CrossOrigin
    public List<String> getAllRole() {
        return userService.getAllRoles();
    }

	
	
	
}



