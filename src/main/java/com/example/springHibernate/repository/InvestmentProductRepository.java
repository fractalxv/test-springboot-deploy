package com.example.springHibernate.repository;

import com.example.springHibernate.model.Customer;
import com.example.springHibernate.model.InvestmentProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentProductRepository extends JpaRepository<InvestmentProduct, Long> {
}
