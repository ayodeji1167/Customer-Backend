package com.customer.customerApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
     CustomerServices customerServices;

    @RequestMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerServices.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "customers")
    public void addCustomers(@RequestBody Customer customer) {
        customerServices.createCustomer(customer);
    }

    @RequestMapping("/customer/{id}")
    public Optional<Customer> getCustomerById(@PathVariable int id) {
        return customerServices.getById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "customers")
    public void updateCustomer(@RequestBody Customer customer) {
        customerServices.updateCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "customer/{id}")
    public void deleteCustomer(@PathVariable int id) {
        customerServices.delete(id);
    }


}



