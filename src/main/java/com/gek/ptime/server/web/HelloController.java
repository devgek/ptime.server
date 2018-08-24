package com.gek.ptime.server.web;

import com.gek.ptime.server.pojo.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @Autowired
    HttpServletRequest request;

    @RequestMapping("hello")
    public  String hello(@RequestParam(value="name", defaultValue="baby") String name) {
        Greeting helloGreeting = new Greeting(hashCode(), name + ", du alter Sack");
        request.setAttribute("helloGreeting", helloGreeting);
        return "hello";
    }
}
