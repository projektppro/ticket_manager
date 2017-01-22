package com.ppro.controller;

import com.ppro.model.Objednavka;
import com.ppro.model.ObjednavkaValidace;
import com.ppro.model.Ticket;
import com.ppro.model.User;
import com.ppro.persistence.person.PersonServiceImpl;
import com.ppro.persistence.ticket.TicketServiceImpl;
import com.ppro.persistence.user.UserServiceImpl;
import com.sun.javafx.sg.prism.NGShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Controller
public class TestController {

    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private ObjednavkaValidace objednavkaValidace;
    @Autowired
    private TicketServiceImpl ticketService;
    @Autowired
    private PersonServiceImpl personService;

    @RequestMapping("/")
    public String sample(){
        User user = new User();
        user.setPassword("radek");
        user.setId(1);
        user.setUsername("ra");
        userService.saveUser(user);
        return "index";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/nabidka_letu")
    public String nabidka_letu() {
        return "nabidka_letu";
    }
    @GetMapping("/objednani")
    public String objednani(Model model) {
        model.addAttribute("objedvaka",new Objednavka());
        return "objednani";
    }
    @PostMapping("/objednani")
    public String objednani(@ModelAttribute("objednani") Objednavka objednavka, BindingResult bindingResult,
                            Model model){
        objednavkaValidace.validate(objednavka,bindingResult);
        if (bindingResult.hasErrors()){
            return "objednani";
        }
        Ticket ticket = new Ticket();
        ticket.setDate(Timestamp.valueOf(LocalDateTime.now()));
        ticket.setPersonid(personService.findByEmail(objednavka.getEmail()).get(0).getId());
        ticket.setAirplaneid(ticket.getAirplaneid());
        ticketService.saveTicket(ticket);
        return "/objednani_uspesne";
    }

    @RequestMapping("/objednani_uspesne")
    public String objednani_uspesne() {
        return "objednani_uspesne";
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
