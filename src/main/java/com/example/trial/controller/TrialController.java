package com.example.trial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrialController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World post request";
    }
}
