package com.service;

import com.entity.Customer;

import java.util.List;

public interface CustomerService {

    public String addCustomer();

    public String deleteCustomer();

    public String updateCustomer();

    public List<Customer> getAllCustomers();

    public int getAllCustomersId();

    public int getCustomerById();

    public int deleteCustomerById();

    public int updateCustomerById();

    public int findAllCustomers();

    public List<Customer> findByNameStartsWith(String name);

    public List<Customer> findByNameEndsWith(String name);

    public String findByNameOrderByName(String name);

    public String findByNameOrderByAsc(String name);

    public String findByNameOrderByDesc(String name);





}
