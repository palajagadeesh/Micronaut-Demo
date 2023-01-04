package com.example.controller;

import com.example.model.Customer;
import com.example.service.CustomerService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

import java.util.List;

@Controller
public class CustomerController {
    @Inject
    private CustomerService customerService;
    @Get("/employeelist")
    public List<Customer> getAllCustomer(){

        return customerService.getAllCustomers();
    }
}
