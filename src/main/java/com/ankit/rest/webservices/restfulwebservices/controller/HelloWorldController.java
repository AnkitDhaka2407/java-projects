package com.ankit.rest.webservices.restfulwebservices.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    String helloWorld() {
        return "Hello World!!!";
    }
}
