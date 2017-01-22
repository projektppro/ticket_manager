package com.ppro.controller;

import com.ppro.model.Airplane;
import com.ppro.model.Flight;
import com.ppro.persistence.flight.FlightRepository;
import com.ppro.persistence.user.UserServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Roman on 20.1.2017.
 */
@Controller
public class FlightController {

    @Autowired
    private UserServiceImpl userService;
    @Qualifier("flightRepository")
    @Autowired
    private FlightRepository flightRepository;

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

    @GetMapping("adm/add_flight")
    public String addFlight(Model model){
        model.addAttribute("flight",new Flight());
        return "/adm/add_flight_form";
    }

    @PostMapping("adm/add_flight")
    public String addFlight(Model model, @ModelAttribute("flight") Flight flight){
        flightRepository.save(flight);
        return "adm/add_flight";
    }
}
