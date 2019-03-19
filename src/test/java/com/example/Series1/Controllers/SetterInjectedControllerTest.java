package com.example.Series1.Controllers;

import com.example.Series1.services.GreetingService;
import com.example.Series1.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetterInjectedControllerTest {
    SetterInjectedController setterInjectedController;
    GreetingService greetingService = new GreetingServiceImpl();
    @Before
    public void setup(){
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(greetingService);
    }
    @Test
    public void checkSayGreetings(){
        assertEquals(GreetingServiceImpl.greetingMessage,setterInjectedController.sayHello());
    }
}