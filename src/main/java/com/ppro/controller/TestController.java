package com.ppro.controller;

import com.ppro.model.User;
import com.ppro.persistence.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Arci on 22.11.2016.
 */
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
}
