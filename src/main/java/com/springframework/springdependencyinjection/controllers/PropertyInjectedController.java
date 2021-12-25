package com.springframework.springdependencyinjection.controllers;

import com.springframework.springdependencyinjection.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

//    not used for the property Injection
//    public void setGreetingService(GreetingService greetingService){
//        this.greetingService = greetingService;
//    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
