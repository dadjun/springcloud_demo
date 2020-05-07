package com.jun.feign.core;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HiHystrix implements EurekaClientFeign{
    @Override
    public String sayHiFromClientEureka(@RequestParam(value = "name") String name) {
        return "hi," + name + ",sorry error!";
    }
}
