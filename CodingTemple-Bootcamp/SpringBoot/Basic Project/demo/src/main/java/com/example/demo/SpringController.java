package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController :tells Spring this class is used to handle web requests
//Request Mapping: Supplies the route ( can by “/”)
//GetMapping:says “run this method when someone goes to / in the browser”

//Dependency Injection- Our SpringService gets injected into our Controller. Thus, allowing us to have access to get Name
//    private final SpringService springService;


@RestController
@RequestMapping("/api/demo")  //This gives api: http://localhost:8080/api/demo
public class SpringController {
    private final SpringService springService;
    private final NextService nextService;
    private final String beanExample;

    public SpringController(SpringService springService, NextService nextService, @Qualifier("beanExample2") String beanExample) {
        this.springService = springService;
        this.nextService = nextService;
        this.beanExample = beanExample;
    }

    @GetMapping()
    public String hello(){
        return "Hello " + springService.getName() + " and "+beanExample +", "+ nextService.getMessage();
    }
}
