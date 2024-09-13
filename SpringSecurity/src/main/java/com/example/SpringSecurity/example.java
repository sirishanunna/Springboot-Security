package com.example.SpringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class example {

    @GetMapping("/")
    public String greet(){
        return "WELCOME TO BLANK PAGE ";
    }
}
