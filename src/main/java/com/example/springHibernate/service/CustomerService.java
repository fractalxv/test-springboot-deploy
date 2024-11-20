package com.example.springHibernate.service;

import com.example.springHibernate.dto.CustomerRequestDTO;
import com.example.springHibernate.model.Customer;
import com.example.springHibernate.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

    public Customer create(CustomerRequestDTO customerRequestDTO){
        Customer customer = new Customer();
        customer.setName(customerRequestDTO.getName());
        customer.setEmail(customerRequestDTO.getEmail());
        return customerRepository.save(customer);
    }

    // make crud
    public Customer update(CustomerRequestDTO customerRequestDTO, Long id){
        Customer customer = customerRepository.findById(id).get();
        customer.setName(customerRequestDTO.getName());
        customer.setEmail(customerRequestDTO.getEmail());
        return customerRepository.save(customer);
    }

    public Customer delete(Long id){
        Customer customer = customerRepository.findById(id).get();
        customerRepository.delete(customer);
        return customer;
    }
    public Customer getById(Long id){
        return customerRepository.findById(id).get();
    }

}
