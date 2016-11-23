package com.ppro.controller;

import com.ppro.model.Airplane;
import com.ppro.persistence.airplane.AirplaneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Arci on 22.11.2016.
 */
@Controller
public class AirplaneController {


    @Autowired
    private AirplaneServiceImpl airplaneService;

    @RequestMapping("/adm/airplane")
    public String saveAiplane(Model model){
        Airplane airplane = new Airplane();
        airplane.setId(5);
        airplane.setName("boing");
        airplaneService.saveAirplane(airplane);
        model.addAttribute("name",airplane.getName());
        return "adm/airplane";
    }
}
