package com.ankit.rest.webservices.restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(path = "/hello-world")
    String helloWorld() {
        return "Hello World!!!";
    }

    @GetMapping(path = "/hello-world-bean")
    HellloWorldBean helloWorldBean() {
        return new HellloWorldBean("Hello World!!!");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    HellloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HellloWorldBean(String.format("Hello World!!!,%s", name));
    }

}
