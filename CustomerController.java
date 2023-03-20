package com.controller;

import com.entity.Customer;
import com.service.CustomerService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @PostMapping(value = "/create", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> addcustomer(@RequestBody Customer customer, HttpServletRequest request) {
        Object Customer;
        String msg = customer.addCustomer(customer);
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }

    @PostMapping(value = "/id", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> getCustomerById(@PathVariable("id") Customer customer,HttpServletRequest request) {
        Object Customer;
        Customer customer1;
        int Cu = customerService.getCustomerById();
        if(customer== null){
            return new ResponseEntity<String>(Customer, HttpStatus.OK);
        }else{
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping(value = "/update", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> updateCustomer(@RequestBody Customer customer) {
    try{
        String msg = customer.updateCustomer(customer);
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }catch(Exception e){
        e.printStackTrace();
        return new ResponseEntity<>(e.getMessage(),HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> deleteCustomer(@PathVariable id) {
        try{
            String msg = customer.deleteCustomerById(id);
            return new ResponseEntity<>(msg, HttpStatus.OK);
    }catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(),HttpStatus.OK);
        }

    @PostMapping(value = "/addcustomer", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> addcustomer(){
        return addcustomer(null);
    }
    @PostMapping(value = "/id", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> getCustomerById(@PathVariable("id") Customer customer) {
        Object Customer;
        Customer customer1;
        int Cu = customerService.getCustomerById();
        if(customer== null){
            return new ResponseEntity<String>(CustomerService, HttpStatus.OK);
        }else{
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }

    }
    @PostMapping(value = "/id", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> getCustomerById(@PathVariable("id") Customer customer) {
        Object Customer;
        Customer customer1;
        int Cu = customerService.getCustomerById();
        if(customer== null){
            return new ResponseEntity<String>(CustomerService, HttpStatus.OK);
        }else{
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }

    }
    @PostMapping(value = "/id", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> getCustomerById(@PathVariable("id") Customer customer) {
        Object Customer;
        Customer customer1;
        int Cu = customerService.getCustomerById();
        if(customer== null){
            return new ResponseEntity<String>(CustomerService, HttpStatus.OK);
        }else{
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }

    }
}
