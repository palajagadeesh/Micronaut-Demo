package com.example.service;

import com.example.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer createCustomer(Customer customer);
   // Customer getCustById(int id);
    Customer updateCustomer(int id,Customer customer);
    void deleteEmployee(int id);
}
