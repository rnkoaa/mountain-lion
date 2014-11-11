package com.richard.service.impl;

import com.richard.service.HelloWorldService;
import org.springframework.stereotype.Service;

/**
 * Created by rnkoaa on 11/10/14.
 */
@Service("helloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String sayHello(String name) {
        return "Service Says Hello To: " + name;
    }
}
