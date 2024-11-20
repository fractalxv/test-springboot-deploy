package com.example.springHibernate.dto;

import lombok.Data;

@Data
public class AddressRequestDTO {
    private String city;
    private String street;
    private String zipCode;
}
