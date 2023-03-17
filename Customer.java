package com.entity;

public class Customer {

    public int id;

    public int age;

    public String name;

    private String email;

    private String username;

    private String password;

    public Customer() {
    }

    public Customer(int id,int age, String name, String email, String username, String password) {
    }

    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername() {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword() {
        this.password = password;
    }
}
