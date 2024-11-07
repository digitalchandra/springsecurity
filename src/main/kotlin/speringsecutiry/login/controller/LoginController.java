package speringsecutiry.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    //To the Dashboard
    @GetMapping("/")
    String dashboard(){
        return "dashboard";
    }
    // Get mapping for handle url
    @GetMapping("/login")
    String login(){
        return "login";
    }
}
