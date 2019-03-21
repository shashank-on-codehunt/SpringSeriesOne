package com.example.Series1.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("de")
@Primary
public class GermanGreetingService implements GreetingService{
    public static String greetingMessage = "Hauptgrußdienst";
    @Override
    public String sayGreetings() {
        return greetingMessage;
    }
}
