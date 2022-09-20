package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
    @RequestMapping(value = "/home", method= RequestMethod.GET)
    @ResponseBody
    public String goHome(HttpServletRequest request) {
        System.out.println("enter");
        return "Hello Spring Boot";
    }
}
