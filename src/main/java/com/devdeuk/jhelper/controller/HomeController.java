package com.devdeuk.jhelper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("")
    public String home() {
        return "Hello world..";
    }


    @GetMapping("jsonTest")
    public Map<String, String> home2() {
        Map<String, String> res = new HashMap<>();
        res.put("greet", "Hello world");
        return res;
    }

}
