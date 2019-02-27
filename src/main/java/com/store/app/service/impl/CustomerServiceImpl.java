package com.store.app.service.impl;

import com.store.app.model.Customer;
import com.store.app.repository.CustomerRepository;
import com.store.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository ;

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }
}
