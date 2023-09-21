package Practice.jwt.controller;

import Practice.jwt.dto.UserEO;
import Practice.jwt.service.JWTService;
import Practice.jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    UserService userService;

    @Autowired
    private JWTService jwtService;

    @Autowired
    AuthenticationManager authenticationManager;

    @GetMapping("/")
    public String welcomePage()
    {
        return("<h1> Welcome to Blog application");
    }

    @PostMapping("/login")
    public UserEO LoginService(@RequestBody UserEO userDetails)
    {
        return null;
        //userServiceImpl.findByEmail(userDetails.getEmail());
    }

    @PostMapping("/register")
    public UserEO NewRegistration(@RequestBody UserEO userDetails)
    {

        UserEO user =userService.findUser(userDetails.getEmail());
        if(user==null)
        {
            return userService.adduser(userDetails);

        }
        else {
            throw new ResponseStatusException(HttpStatus.NO_CONTENT, "User Doesn't exist");
        }
    }


    @PostMapping("/user/authenticate")
    public  String generateToken(@RequestBody UserEO user)
    {
        Authentication auth =authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUserName(),user.getPassword()));
      System.out.println(auth.getDetails());
       if(auth.isAuthenticated()) {

           return jwtService.generateToken(user.getUserName());
       }
       else{

           throw new UsernameNotFoundException("Invalid User");
       }

    }





}
