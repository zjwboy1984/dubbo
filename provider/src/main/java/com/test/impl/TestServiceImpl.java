package com.test.impl;

import com.test.TestService;

public class TestServiceImpl implements TestService {
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}  