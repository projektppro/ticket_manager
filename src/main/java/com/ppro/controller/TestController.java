package com.ppro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/")
    public String sample(){
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
