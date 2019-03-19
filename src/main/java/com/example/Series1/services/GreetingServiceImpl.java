package com.example.Series1.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServiceImpl implements GreetingService {
    public static String greetingMessage = "Primary Greeting Service";
    @Override
    public String sayGreetings() {
        return greetingMessage;
    }
}
