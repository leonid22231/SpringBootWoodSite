package com.lyadev.SiteWood.Controllers;

import com.lyadev.SiteWood.Entity.WoodEntity;
import com.lyadev.SiteWood.Service.WoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {
    @Autowired
    private WoodService woodService;
    @GetMapping("/")
    public String Main(Model model){
        System.out.println(woodService.getAll().size());
        model.addAttribute("woods", woodService.getAll());
        return "index";
    }
    @GetMapping("/Product/{name}.{id}")
    public String Product(@PathVariable("name")String name,@PathVariable("id")Long id, Model model){
        WoodEntity wood = woodService.get(id);
        model.addAttribute("name", wood.getName());
        model.addAttribute("img",wood.getImage());
        model.addAttribute("thickness",wood.getThickness());
        model.addAttribute("long",wood.getLongi());
        model.addAttribute("width",wood.getWidth());
        model.addAttribute("sort",wood.getSort());
        model.addAttribute("form",wood.getForm());
        model.addAttribute("price",wood.getPrice());

        return "product";
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
