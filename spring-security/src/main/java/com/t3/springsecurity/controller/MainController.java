package com.t3.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String home(){
        return "<h1> Pagina Inicial </h1>";
    }

    @GetMapping("/private")
    public String privatePage(){
        return "<h1> Pagina Secreta </h1>";
    }
    
}
