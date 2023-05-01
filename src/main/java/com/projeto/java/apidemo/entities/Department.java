package com.projeto.java.apidemo.entities;

public class Department {
    private Long id;
    private String name;

    //create the constructors
    public Department() {
    }

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    //getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
        
}
