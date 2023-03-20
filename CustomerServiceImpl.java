package com.service;

import com.entity.Customer;
import com.repo.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    private CustomerService customerService;
    private Object repository;
    public CustomerServiceImpl(CustomerRepository Repository){

        this.repository = repository;
    }
    @Override
    public String addCustomer() {
        return null;
    }

    @Override
    public String deleteCustomer(Customer customer)  {
        return null;
    }

    @Override
    public String deleteCustomer(String id) {
        repository.toString();
        return "customer record deleted successfully";
    }


    @Override
    public String updateCustomer() {
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return null;
        //return repository.findAll();;
    }

    @Override
    public int getAllCustomersId() {
        return 0;
    }

    @Override
    public int getCustomerById() {
        return 0;
    }

    @Override
    public int deleteCustomerById() {
        return 0;
    }

    @Override
    public int updateCustomerById() {
        return 0;
    }

    @Override
    public int findAllCustomers() {
        return 0;
    }

    @Override
    public List<Customer> findByNameStartsWith(String name) {
        return null;
    }

    @Override
    public List<Customer> findByNameEndsWith(String name) {
        return null;
    }

    @Override
    public String findByNameOrderByName(String name) {
        return null;
    }

    @Override
    public String findByNameOrderByAsc(String name) {
        return null;
    }

    @Override
    public String findByNameOrderByDesc(String name) {
        return null;
    }
}
