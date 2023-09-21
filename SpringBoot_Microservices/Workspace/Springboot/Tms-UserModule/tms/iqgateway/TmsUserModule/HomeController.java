package tms.iqgateway.TmsUserModule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class HomeController {
	
	@Autowired
	private UserService userService;
	
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
    public String validateLogin(@RequestBody UserEO user) {
        String roleName = userService.LoginValidation(user.getUsername(), user.getPassword());
        if (roleName != null) {
            return roleName;
        } else {
            return "Invalid credentials. User not found.";
        }
    }
    @GetMapping("/roles")
    @CrossOrigin
    public List<String> getAllRoles() {
        return userService.getAllRoles();
    }

    }

