package com.ppro.controller;

import com.ppro.model.Destination;
import com.ppro.model.validators.DestinationValidator;
import com.ppro.persistence.destination.DestinationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
/**
 * Created by Roman on 18.1.2017.
 */
@Controller
public class DestinationController {

    @Autowired
    private DestinationServiceImpl destinationService;
    @Autowired
    private DestinationValidator destinationValidator;


    @RequestMapping("/adm/destination/destination")
    public String getAllDestinations(Model model){
        // TODO změnit dummy data na načítání z DB
        Destination destination1 = new Destination(1,"Letiště Václava Havla", "Praha", "Česká republika", "ČR");
        Destination destination2 = new Destination(2,"Hlravní letiště", "Bratislava", "Slovensko", "SK");
        Destination destination3 = new Destination(3,"Moskevské letiště", "Moskva", "Rusko", "RU");
        model.addAttribute(destination1);
        model.addAttribute(destination2);
        model.addAttribute(destination3);
        return "adm/destination/destination";
    }


    @RequestMapping("/adm/destination/add_destination_form")
    public String show(Model model){
        model.addAttribute("destination", new Destination(0,null,null,null,null));
        return "adm/destination/add_destination_form";
    }

   // @RequestMapping("/adm/destination/add_destination_form")
   // public String addDestinationGet(Model model){
   //     model.addAttribute("destination", new Destination());
   //     return "adm/destination/add_destination_form";
   // }

    @PostMapping("/adm/destination/add_destination_form")
    public String addDestinationPost(@ModelAttribute("destination") Destination destination, BindingResult bindingResult, Model model){
        destinationValidator.validate(destination,bindingResult);
        if (bindingResult.hasErrors()) {
            return "adm/destination/add_destination_form";
        }
        //return "adm/result";
        return "adm/destination/add_destination_form";
    }
}
