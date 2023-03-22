package com.controller;

import com.entity.Customer;
import com.service.CustomerService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @PostMapping(value = "/create", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> addcustomer(@RequestBody Customer customer, HttpServletRequest request) {
        String msg = customer.addCustomer(customer);
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }

    @PostMapping(value = "/id", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> getCustomerById(@PathVariable("id") Customer customer, HttpServletRequest request) {
        Object Customer;
        Customer customer1;
        int Cu = customerService.getCustomerById();
        if (customer == null) {
            return new ResponseEntity<String>(Customer, HttpStatus.OK);
        } else {
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping(value = "/update", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> updateCustomer(@RequestBody Customer customer) {
        try {
            String msg = customer.updateCustomer(customer);
            return new ResponseEntity<>(msg, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
        }
    }

    @DeleteMapping(value = "/delete", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> deleteCustomer(@RequestBody Customer customer) {
        try {
            String msg = customer.deleteCustomer(customer);
            return new ResponseEntity<>(msg, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
        }
    }

    @PostMapping(value = "/addcustomer", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> addcustomer(@RequestBody Customer customer, HttpServletRequest request) {
        //Customer HttpServletRequest;
        return addcustomer(HttpServletRequest request);
    }


    @PostMapping(value = "/id", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> getCustomerById(@PathVariable("id") Customer customer) {
        //Object Customer;
        //Customer customer1;
        int Cu = customerService.getCustomerById();
        if (customer != null) {
            return new ResponseEntity<String>(String.valueOf(customer),(HttpStatusCode)HttpStatus.OK);
        } else {
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping(value = "/delet{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> getCustomerById(@PathVariable("id") Customer customer HttpServletRequest request) {
        Object Customer;
        Customer customer1;
        int Cu = customerService.getCustomerById();
        if (customer != null) {
            return new ResponseEntity<String>(customer, HttpStatus.OK);
        } else {
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping(value = "/update{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> updateCustomerById(@PathVariable("id")Customer customer) {
        //Object Customer;
        //Customer customer1;
        int Cu = customerService.getCustomerById();
        if (customer!= null) {
            return new ResponseEntity<String>(updateCustomer(customerService), HttpStatus.OK);
        } else {
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
    }
}
