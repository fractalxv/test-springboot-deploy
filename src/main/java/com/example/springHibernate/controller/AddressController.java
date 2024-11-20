package com.example.springHibernate.controller;

import com.example.springHibernate.dto.AddressRequestDTO;
import com.example.springHibernate.model.Address;
import com.example.springHibernate.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired //implementasi dependency JSON, utk manggil class AccountRepository
    private AddressService addressService;

    @GetMapping("/")
    public List<Address> getAll() {
        return addressService.getAll();
    }

    @PostMapping("/")
    public Address create(
            @RequestBody AddressRequestDTO addressRequestDTO
    ) {
        return addressService.create(addressRequestDTO);
    }

    @GetMapping("/{id}")
    public Address getById(@PathVariable Long id){
        return addressService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        addressService.delete(id);
    }

//    @PutMapping("/{id}")
//    public Account update(
//            @RequestBody AccountRequestDTO accountRequestDTO,
//            @PathVariable Long id
//    ) {
//        public Account update(Long id, AccountRequestDTO accountRequestDTO);    }

}
