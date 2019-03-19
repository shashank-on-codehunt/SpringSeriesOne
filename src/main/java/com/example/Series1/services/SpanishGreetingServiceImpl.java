package com.example.Series1.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class SpanishGreetingServiceImpl implements GreetingService{
    public static String greetingMessage = "Servicio de saludo primario";
    @Override
    public String sayGreetings() {
        return greetingMessage;
    }
}
