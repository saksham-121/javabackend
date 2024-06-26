package com.sktech.sktech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @GetMapping("/")

    public String home(){
        return "Home";
    }

    @GetMapping("/hello")

    public String hello(){
        return "Hellow,saksham";
    }


}
