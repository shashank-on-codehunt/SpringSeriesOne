package com.example.Series1.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    public static String greetingMessage = "Sample Greeting Stub";
    @Override
    public String sayGreetings() {
        return greetingMessage;
    }
}
