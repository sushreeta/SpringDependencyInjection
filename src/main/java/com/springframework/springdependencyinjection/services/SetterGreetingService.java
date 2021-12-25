package com.springframework.springdependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Hello World --setter injected";
    }
}
