package com.lyadev.SiteWood.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/Main")
    public String Main(){
        return "index";
    }
    @GetMapping("/Delivery")
    public String Delivery() {
        return "delivery";
    }
    @GetMapping("/Contact")
    public String Contact(){
        return "contact";
    }
    @GetMapping("/About")
    public String About(){
        return "about";
    }
}
