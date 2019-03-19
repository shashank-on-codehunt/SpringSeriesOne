package com.example.Series1.Controllers;

import com.example.Series1.services.GreetingService;

public class ConstructorInjectedController {
    public GreetingService greetingService;
    public String sayHello(){
        return greetingService.sayGreetings();
    }
    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
