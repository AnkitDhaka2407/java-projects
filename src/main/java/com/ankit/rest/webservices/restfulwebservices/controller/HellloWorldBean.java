package com.ankit.rest.webservices.restfulwebservices.controller;

public class HellloWorldBean {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HellloWorldBean(String s) {
        this.message=s;
    }

    @Override
    public String toString() {
        return "HellloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
