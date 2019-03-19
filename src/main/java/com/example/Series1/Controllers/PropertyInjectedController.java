package com.example.Series1.Controllers;

import com.example.Series1.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;
    public String sayHello(){
        return greetingService.sayGreetings();
    }
}
