package com.ankit.rest.webservices.restfulwebservices.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class User {

    @Size(min=2,message = "User name should be at least 2 characters long")
    @JsonProperty("user_name")
    private String name;

    @JsonIgnore
    private Integer id;

    @Past(message = "Birth date should be in the past")
    @JsonProperty("birth_date")
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
