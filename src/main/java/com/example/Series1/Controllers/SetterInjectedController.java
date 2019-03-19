package com.example.Series1.Controllers;

import com.example.Series1.services.GreetingService;

public class SetterInjectedController {
    public GreetingService greetingService;
    public String sayHello(){
        return greetingService.sayGreetings();
    }
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
