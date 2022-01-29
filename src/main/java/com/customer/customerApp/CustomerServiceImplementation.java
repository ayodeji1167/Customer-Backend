package com.customer.customerApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CustomerServiceImplementation implements CustomerServices {

    @Autowired
    CustomerRepository customerRepository;

    public void createCustomer(Customer customer) {

        customerRepository.save(customer);

    }

    public List<Customer> findAll() {
        return  customerRepository.findAll();
    }

    public Optional<Customer> getById(Integer id) {
        return customerRepository.findById(id);
    }

    public void updateCustomer(Customer customer) {
        customerRepository.save(customer);

    }

    public void delete(int id) {
        customerRepository.deleteById(id);
    }
}
