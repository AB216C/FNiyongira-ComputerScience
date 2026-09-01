package com.example.demo;

import org.springframework.stereotype.Component;


//For ever new Java class to add, Make sure @Component is Added
//@Component tells Spring to automatically detect and manage a class as a bean.
// It scans for classes with this annotation, creates their instances, injects their dependencies, and makes them available for use throughout the application — no extra configuration needed.
//Spring scans for @Component, creates an instance, and injects it into the controller.
//Instead of manually creating objects, Spring manages and "injects" them where needed. This is the core part of Dependency injection.
@Component
public class SpringService {

    public String getName(){
        return "Jimmy";
    }
}
