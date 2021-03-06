package com.example.Series1.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en","default"})
public class GreetingServiceImpl implements GreetingService {
    public static String greetingMessage = "Primary Greeting Service";
    @Override
    public String sayGreetings() {
        return greetingMessage;
    }
}
