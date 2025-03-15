package com.example.msatest2.customer.controller;

import com.example.msatest2.customer.entity.Customer;
import com.example.msatest2.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/query")
    public List<Customer> getCustomers() {
        return customerService.getAllCustomers();
    }
}