package com.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.io.Serializable;

@Entity
@Table(name = "Customer")

public class Customer {

    @Column
    public int id;

    @Column
    public int age;

    @Column
    public String name;

    @Column
    private String email;

    @Column private String username;

    @Column
    private String password;
    @Column
    private int addCustomer;
    @Column
    private int updateCustomer;
    @Column
    private int deleteCustomer;

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

    public String addCustomer(Customer customer) {
        this.addCustomer = addCustomer;
        return addCustomer(customer);
    }

    public String updateCustomer(Customer customer) {
        this.updateCustomer = updateCustomer;
        return updateCustomer(customer);
    }


    public String deleteCustomer(Customer customer) {
        //this.deleteCustomer = deleteCustomer(deleteCustomer);
        return deleteCustomer(customer);
    }
}
