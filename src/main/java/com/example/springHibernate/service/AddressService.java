package com.example.springHibernate.service;

import com.example.springHibernate.dto.AddressRequestDTO;
import com.example.springHibernate.model.Address;
import com.example.springHibernate.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAll(){
        return addressRepository.findAll();
    }

    public Address create(AddressRequestDTO addressRequestDTO) {
        Address address = new Address();
        address.setCity(addressRequestDTO.getCity());
        address.setStreet(addressRequestDTO.getStreet());
        address.setZipCode(addressRequestDTO.getZipCode());
        return addressRepository.save(address);
    }
    public Address getById(Long id) {
        return addressRepository.findById(id).orElse(null);
    }
        public void delete(Long id) {
            addressRepository.deleteById(id);
        }
    }



