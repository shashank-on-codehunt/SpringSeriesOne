package com.example.Series1.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    public static String greetingMessage = "Setter Greeting Stub";
    @Override
    public String sayGreetings() {
        return greetingMessage;
    }
}
