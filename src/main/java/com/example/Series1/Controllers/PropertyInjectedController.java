package com.example.Series1.Controllers;

import com.example.Series1.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    //we can also change the reference name or the name of the property can also be same as bean name thats a shortcut of not using Qualifier
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingService;
    public String sayHello(){
        return greetingService.sayGreetings();
    }
}
