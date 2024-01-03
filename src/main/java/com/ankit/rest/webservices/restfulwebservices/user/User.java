package com.ankit.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;

public class User {
    private String name;
    private Integer id;
    private LocalDate brithDate;

    public User(Integer id, String name, LocalDate brithDate) {
        this.name = name;
        this.id = id;
        this.brithDate = brithDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", brithDate=" + brithDate +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getBrithDate() {
        return brithDate;
    }

    public void setBrithDate(LocalDate brithDate) {
        this.brithDate = brithDate;
    }
}
