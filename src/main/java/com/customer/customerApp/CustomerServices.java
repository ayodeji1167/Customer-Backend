package com.customer.customerApp;



import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomerServices  {

    void createCustomer(Customer customer);

    List<Customer> findAll();

    Optional<Customer> getById(Integer integer);

    void updateCustomer(Customer customer);

    void delete(int id);


}
