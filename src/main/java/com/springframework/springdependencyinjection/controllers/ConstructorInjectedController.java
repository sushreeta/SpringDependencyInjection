package com.springframework.springdependencyinjection.controllers;

import com.springframework.springdependencyinjection.services.GreetingService;

public class ConstructorInjectedController {
    private final GreetingService  greetingService;

    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
