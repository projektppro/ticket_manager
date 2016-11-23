package com.ppro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Arci on 22.11.2016.
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String sample(){
        return "index";
    }
}
