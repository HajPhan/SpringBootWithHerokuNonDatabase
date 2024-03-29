package com.example.SpringBootWithHerokuNonDatabase.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value = {"/", "/home"})
    public String home() {
        return "Home";
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "Index";
    }

}
