package com.customer.customerApp.Data;


import lombok.Data;


import javax.persistence.*;
import javax.validation.constraints.Email;


@Entity
@Table(name = "customer")
@Data

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Email
    private String email;


    private double salary;


}
