package com.example.springHibernate.controller;

import com.example.springHibernate.model.Account;
import com.example.springHibernate.repository.AccountRepository;
import com.example.springHibernate.service.AccountService;
import com.example.springHibernate.dto.AccountRequestDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.example.springHibernate.dto.AccountRequestDTO;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired //implementasi dependency JSON, utk manggil class AccountRepository
    private AccountService accountService;

    @GetMapping("/")
    public List<Account> getAll() {
        return accountService.getAll();
    }

    @PostMapping("/")
    public Account create(
            @RequestBody AccountRequestDTO accountRequestDTO
    ) {
        return accountService.create(accountRequestDTO);
    }

    @GetMapping("/{id}")
    public Account getById(@PathVariable Long id){
        return accountService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        accountService.delete(id);
    }

//    @PutMapping("/{id}")
//    public Account update(
//            @RequestBody AccountRequestDTO accountRequestDTO,
//            @PathVariable Long id
//    ) {
//        public Account update(Long id, AccountRequestDTO accountRequestDTO);    }

}
