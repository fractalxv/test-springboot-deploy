package com.example.springHibernate.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity(name = "investmentProduct")
public class InvestmentProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private String productValue;

//    @ManyToMany
//    @JoinTable(
//            name = "investment_product_customer",
//            joinColumns = @JoinColumn(name = "investment_product_id"),
//            inverseJoinColumns = @JoinColumn(name = "customer_id"))
//    private List<Customer> customers;
//
}
