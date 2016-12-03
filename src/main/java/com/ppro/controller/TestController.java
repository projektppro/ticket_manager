package com.ppro.controller;

import com.ppro.model.User;
import com.ppro.persistence.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/")
    public String sample(){
        User user = new User();
        user.setPassword("radek");
        user.setId(1);
        user.setUsername("ra");
        userService.saveUser(user);
        return "index";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/onas")
    public String onas(){
        return "onas";
    }
    @RequestMapping("/reference")
    public String reference(){
        return "reference";
    }
    @RequestMapping("/kontakty")
    public String kontakty(){
        return "kontakty";
    }
    @RequestMapping("/prihlasit")
    public String prihlasit(){
        return "prihlasit";
    }
    @RequestMapping("/registrace")
    public String registrace(){
        return "registrace";
    }
}
