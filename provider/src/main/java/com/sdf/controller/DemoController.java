package com.sdf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DemoController {

    @GetMapping(value = "/")
    public String hello(HttpServletRequest req){
        return req.getRequestURL().toString();
    }
}
