package com.gek.ptime.server.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @RequestMapping("/")
    public  String welcome() {
        return "welcome";
    }
}