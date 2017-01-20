package com.ppro.controller;

import com.ppro.model.Airplane;
import com.ppro.persistence.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Roman on 20.1.2017.
 */
@Controller
public class FlightController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/adm/flight/flight")
    public String destination(){
        return "adm/flight/flight";
    }
    @RequestMapping("/adm/flight/add_flight_form")
    public String dest(Model model){
        Airplane airplane = new Airplane();
        model.addAttribute("airplane", airplane);
        return "adm/flight/add_flight_form";
    }
}
