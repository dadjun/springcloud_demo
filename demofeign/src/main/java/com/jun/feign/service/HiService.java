package com.jun.feign.service;

import com.jun.feign.core.EurekaClientFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiService {

    @Autowired
    EurekaClientFeign eurekaClientFeign;

    @HystrixCommand(fallbackMethod = "errorHi")
    public String sayHi(String name){
        return   "from Feign " + eurekaClientFeign.sayHiFromClientEureka(name);
    }

}
