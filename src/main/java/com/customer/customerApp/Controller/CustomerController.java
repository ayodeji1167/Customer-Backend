package Controller;

import Data.Customer;
import Service.CustomerServiceImplementation;
import Service.CustomerServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerServiceImplementation customerServices;

    @RequestMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerServices.findAll();
    }

//    @RequestMapping(method = RequestMethod.POST, value = "/customers")
//    @PostMapping("/customers")
//    public void addCustomers(@RequestBody Customer customer) {
//        log.info("GOT HERE !!!");
//        customerServices.createCustomer(customer);
//    }

    @PostMapping("")
    public ResponseEntity<?> createCustomer(@RequestBody Customer customer){
        log.info("GOT HERE !!!");
        customerServices.createCustomer(customer);

        return ResponseEntity.status(200).body("Customer created");
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



