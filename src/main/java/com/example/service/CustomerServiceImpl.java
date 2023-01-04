package com.example.service;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class CustomerServiceImpl implements CustomerService {
    @Inject
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

//    @Override
//    public Customer getCustById(int id) {
//        return customerRepository.findById(id).get();
//    }

    @Override
    public Customer updateCustomer(int id, Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteEmployee(int id) {
  customerRepository.deleteById(id);
    }
}
