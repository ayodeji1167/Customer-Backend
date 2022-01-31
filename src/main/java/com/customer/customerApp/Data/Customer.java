package com.customer.customerApp.Data;


import lombok.Data;


import javax.persistence.*;


@Entity
@Table(name = "customer")
@Data

public class Customer {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "salary")
    private double salary;




}
