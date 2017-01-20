package com.ppro.controller;

import com.ppro.model.Airplane;
import com.ppro.persistence.airplane.AirplaneServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created by Arci on 22.11.2016.
 */
@Controller
public class AirplaneController {
    private static final Logger log = Logger.getLogger(AirplaneController.class);

    @Autowired
    private AirplaneServiceImpl airplaneService;

    @RequestMapping("/adm/airplane/airplane")
    public String saveAiplane(Model model){
       // Airplane airplane = new Airplane();
       // airplane.setId(5);
       // airplane.setName("boing");
       // airplaneService.saveAirplane(airplane);
      //  model.addAttribute("name",airplane.getName());
        return "adm/airplane/airplane";
    }
    @RequestMapping("/adm/airplane/add_airplane_form")
    public String addairplane(Model model){
        Airplane airplane = new Airplane();
        model.addAttribute("airplane", airplane);
        return "adm/airplane/add_airplane_form";
    }
    @GetMapping("adm/add_airplane")
    public String addAirplaneGet(Model model){
        //Airplane airplane = new Airplane();
       // model.addAttribute("airplane", airplane);
        return "adm/airplane/add_airplane_form";
    }

    @PostMapping("adm/add_airplane")
    public String addAirplanePost(@Valid @RequestAttribute("airplane") Airplane airplane, BindingResult bindingResult, Model model){
        //airplaneService.saveAirplane(airplane);
        model.addAttribute("result"," Letadlo bylo uloženo");
        //log.info("Airplane was saved: "+airplane.toString());// TODO: 25.11.2016 dodelat prevod na string u vsech
        return "result";
    }
}
