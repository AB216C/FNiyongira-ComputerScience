package com.example.demo;

import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

@Component
public class NextService {
    public String getMessage(){
        return "We're so Happy that you are here";
    }
}
