package com.example.springHibernate.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

//    @OneToOne
//    @JoinColumn(name = "address_id")
//    private Address address;
//    @OneToMany(mappedBy = "customer")
//    private List<Account> accounts;

}