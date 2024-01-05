package com.ankit.rest.webservices.restfulwebservices.helloworld;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private MessageSource messageSource;

    public HelloWorldController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

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

    @GetMapping(path = "/hello-world-internationalized")
    String helloWorldInternationalized() {
        return messageSource.getMessage("good.morning.message", null, "Default Message", LocaleContextHolder.getLocale());
    }

}
