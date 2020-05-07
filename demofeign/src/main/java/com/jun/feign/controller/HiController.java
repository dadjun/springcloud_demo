package com.jun.feign.controller;

import com.jun.feign.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
/*
    @Value("${server.port}")
    String port;*/

    @Autowired
    HiService hiService;



    @GetMapping("/hi")
    public String sayHi(@RequestParam(defaultValue = "dadjun",required = false) String name) {

        Integer i=10;
        return hiService.sayHi(name);
    }
}
