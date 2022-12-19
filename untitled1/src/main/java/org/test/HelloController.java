package org.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/test")
    public String hand01(){
        System.out.println("controller start!");
        return "controller start!";
    }
}
