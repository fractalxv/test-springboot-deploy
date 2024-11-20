package com.example.springHibernate.service;

import com.example.springHibernate.dto.CustomerRequestDTO;
import com.example.springHibernate.dto.InvestmentProductRequestDTO;
import com.example.springHibernate.model.Customer;
import com.example.springHibernate.model.InvestmentProduct;
import com.example.springHibernate.repository.CustomerRepository;
import com.example.springHibernate.repository.InvestmentProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestmentProductService {
    @Autowired
    private InvestmentProductRepository investmentProductRepository;

    public List<InvestmentProduct> getAll(){
        return investmentProductRepository.findAll();
    }

    public InvestmentProduct create(InvestmentProductRequestDTO investmentProductRequestDTO){
        InvestmentProduct investmentProduct = new InvestmentProduct();
        investmentProduct.setProductName(investmentProductRequestDTO.getProductName());
        investmentProduct.setProductValue(investmentProductRequestDTO.getProductValue());
        return investmentProductRepository.save(investmentProduct);
    }


}
