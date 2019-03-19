package com.example.Series1.Controllers;

import com.example.Series1.services.GreetingService;
import com.example.Series1.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorInjectedControllerTest {
    ConstructorInjectedController constructorInjectedController;
    @Before
    public void setup(){
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }
    @Test
    public void checkSayGreetings(){
        assertEquals(GreetingServiceImpl.greetingMessage,constructorInjectedController.sayHello());
    }
}