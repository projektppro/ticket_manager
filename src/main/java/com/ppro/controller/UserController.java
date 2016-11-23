package com.ppro.controller;

import com.ppro.model.User;
import com.ppro.persistence.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Arci on 22.11.2016.
 */
@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/adm/user")
    public String user(Model model){
        User user = new User();
        user.setId(6);
        user.setUsername("franta");
        user.setPassword("d");
        userService.saveUser(user);
        return "adm/user";
    }
}
