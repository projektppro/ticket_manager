package com.ppro.controller;

import com.ppro.model.Airplane;
import com.ppro.persistence.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Roman on 18.1.2017.
 */
@Controller
public class DestinationController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/adm/destination/destination")
    public String destination(){
        return "adm/destination/destination";
    }
    @RequestMapping("/adm/destination/add_destination_form")
    public String dest(Model model){
        Airplane airplane = new Airplane();
        model.addAttribute("airplane", airplane);
        return "adm/destination/add_destination_form";
    }
}
