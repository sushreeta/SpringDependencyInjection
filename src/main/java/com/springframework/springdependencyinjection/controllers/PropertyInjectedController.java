package com.springframework.springdependencyinjection.controllers;

import com.springframework.springdependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyGreetingService")
    @Autowired
    public GreetingService greetingService;

//    not used for the property Injection
//    public void setGreetingService(GreetingService greetingService){
//        this.greetingService = greetingService;
//    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
