package com.example.springHibernate.model;

import jakarta.persistence.*;
import com.example.springHibernate.model.Customer;
import lombok.Data;

@Data
@Entity(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private String zipCode;

//    @OneToOne
//    @JoinColumn(name = "customer_id")
//    private Customer customer;


}
