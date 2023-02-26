package com.louisviktor.rest.webservices.restfulwebservice.user;

public class User {
    private Integer id;
    private String name;
    private String birthDate;

    public User(Integer id, String name, String birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User [birthDate=" + birthDate + ", id=" + id + ", name=" + name + "]";
    }
}

