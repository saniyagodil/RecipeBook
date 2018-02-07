package com.company.recipebook;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Main";
    }

    @RequestMapping("/gallery")
    public String listAll(){
        return "Gallery";
    }

    @RequestMapping("/bara")
    public String bara(){
        return "Bara";
    }

    @RequestMapping("/croque")
    public String croqueMadame(){
        return "CroqueMadame";
    }

    @RequestMapping("/golabjamun")
    public String golabJamun(){
        return "GolabJamun";
    }

    @RequestMapping("/injera")
    public String injera(){
        return "Injera";
    }

    @RequestMapping("/jerkchicken")
    public String jerkChicken(){
        return "JerkChicken";
    }
    @RequestMapping("/pumpkinnoodles")
    public String pumpkinNoodles(){
        return "PumpkinNoodles";
    }
}


