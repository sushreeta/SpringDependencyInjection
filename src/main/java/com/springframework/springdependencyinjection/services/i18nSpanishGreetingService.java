package com.springframework.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class i18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Hola Mundo, i18n Spanish";
    }
}

