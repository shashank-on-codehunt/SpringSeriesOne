package com.example.Series1.Controllers;

import com.example.Series1.services.GreetingService;
import com.example.Series1.services.GreetingServiceImpl;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyInjectedControllerTest {
    PropertyInjectedController propertyInjectedController;
    GreetingService greetingService = new GreetingServiceImpl();
    @Before
    public void setup(){
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = greetingService;
    }
    @Test
    public void checkSayGreetings(){
        assertEquals(GreetingServiceImpl.greetingMessage,propertyInjectedController.sayHello());
    }
}