package com.example.firstCloudFoundryApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("/message")
    public String getMessage(){
        return "Hi, This is my First CloudFoundryApp";
    }
}
