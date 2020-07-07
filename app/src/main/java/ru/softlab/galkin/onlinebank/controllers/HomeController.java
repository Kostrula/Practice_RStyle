package ru.softlab.galkin.onlinebank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getIndex(){
        return "index";
    }

    @RequestMapping("/welcome")
    public String getWelcome(){
        return "welcome";
    }
}
