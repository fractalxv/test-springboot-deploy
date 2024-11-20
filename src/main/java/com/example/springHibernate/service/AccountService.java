package com.example.springHibernate.service;

import com.example.springHibernate.model.Account;
import com.example.springHibernate.repository.AccountRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springHibernate.dto.AccountRequestDTO;

import java.util.List;
@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    public List<Account> getAll(){
        return accountRepository.findAll();
    }

    public Account create(AccountRequestDTO accountRequestDTO){
        Account account = new Account();
        account.setAccountNumber(accountRequestDTO.getAccountNumber());
        account.setBalance(accountRequestDTO.getBalance());
        return accountRepository.save(account);
    }

    public Account getById(Long id) {
        return accountRepository.findById(id).orElse(null);
    }

//    public Account update(Long id, AccountRequestDTO accountRequestDTO) {
//        Account account = accountRepository.findById(id).orElse(null);
//        if (account != null) {
//            account.setAccountNumber(accountRequestDTO.getAccountNumber());
//            account.setBalance(accountRequestDTO.getBalance());
//            return accountRepository.save(account);
//        }
//        return null;
//    }

    public void delete(Long id) {
        accountRepository.deleteById(id);
    }
}
