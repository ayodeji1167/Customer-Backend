package com.customer.customerApp.Repository;


import com.customer.customerApp.Data.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {


}
