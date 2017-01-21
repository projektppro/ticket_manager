package com.ppro.controller;

import com.ppro.model.Airplane;
import com.ppro.persistence.airplane.AirplaneServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
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
    @Autowired
    private AiplaneValidator aiplaneValidator;


    @RequestMapping("/adm/airplane")
    public String saveAiplane(Model model){
        Airplane airplane = new Airplane();
        airplane.setId(5);
        airplane.setName("boing");
        airplaneService.saveAirplane(airplane);
        model.addAttribute("name",airplane.getName());
        return "adm/airplane/airplane";
    }

    @GetMapping("adm/add_airplane")
    public String addAirplaneGet(Model model){
        model.addAttribute("airplane",new Airplane());
        return "adm/airplane/add_airplane_form";
    }

    @PostMapping("adm/add_airplane")
    public String addAirplanePost(@ModelAttribute("airplane") Airplane airplane, BindingResult bindingResult, Model model){
        aiplaneValidator.validate(airplane,bindingResult); // validace aiplane
        if (bindingResult.hasErrors()) {
            return "adm/airplane/add_airplane_form";
        }
        airplaneService.saveAirplane(airplane);
        model.addAttribute("result"," Letadlo bylo uloženo");
        log.info("Airplane was saved: "+airplane.toString());// TODO: 25.11.2016 dodelat prevod na string u vsech
        return "adm/result";
    }
}
