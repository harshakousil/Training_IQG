package practice.blogApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import practice.blogApp.Dto.UserEO;
import practice.blogApp.Service.JWTService;
import practice.blogApp.Service.PostService;
import practice.blogApp.Service.UserService;
import practice.blogApp.Service.UserServiceImpl;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    UserService userService;

    @Autowired
            private JWTService jwtService;
    UserServiceImpl userServiceImpl;
    @GetMapping("/")
    public String welcomePage()
    {
        return("<h1> Welcome to Blog application");
    }

    @PostMapping("/login")
    public Optional<UserEO> LoginService(@RequestBody UserEO userDetails)
    {
        return null;
        //userServiceImpl.findByEmail(userDetails.getEmail());
    }

    @PostMapping("/authenticate")
    public  String generateToken(@RequestBody UserEO user)
    {
        return jwtService.generateToken(user.getUserName());

    }





}
