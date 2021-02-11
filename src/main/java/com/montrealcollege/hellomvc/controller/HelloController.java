package com.montrealcollege.hellomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC!");
        return "hello";
    }

    @RequestMapping(path = "/world", method = RequestMethod.GET)
    public String sayHelloWorld(ModelMap model) {
        model.addAttribute("message", "Hello World Spring MVC!");
        return "hello";
    }

}

