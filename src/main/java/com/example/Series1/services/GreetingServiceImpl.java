package com.example.Series1.services;

public class GreetingServiceImpl implements GreetingService {
    public static String greetingMessage = "Sample Greeting Stub";
    @Override
    public String sayGreetings() {
        return greetingMessage;
    }
}
