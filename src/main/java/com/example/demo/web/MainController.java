package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/resource")
public class MainController {

    @GetMapping
    public String get(){
        System.out.println("");
        return "resource";
    }

}
