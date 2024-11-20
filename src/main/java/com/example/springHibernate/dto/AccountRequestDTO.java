package com.example.springHibernate.dto;

import lombok.Data;

@Data
public class AccountRequestDTO {
    private Double balance;
    private String accountType;
    private String accountNumber;
}
