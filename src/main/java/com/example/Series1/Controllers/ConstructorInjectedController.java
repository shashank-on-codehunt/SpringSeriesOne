package com.example.Series1.Controllers;

import com.example.Series1.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    public GreetingService greetingService;
    public String sayHello(){
        return greetingService.sayGreetings();
    }
    //For Constructor it is not needed to explicitly declare it with Autowired as by default it supports Constructor Autowiring , this is the reason that Constructor autowiring is preferred
    @Autowired
    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
