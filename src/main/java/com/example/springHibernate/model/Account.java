package com.example.springHibernate.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long customerId;
    @Column(nullable = false)
    private Double balance;
    @Column(nullable = false)
    private String accountType;
    @Column(nullable = false)
    private String accountNumber;



}
