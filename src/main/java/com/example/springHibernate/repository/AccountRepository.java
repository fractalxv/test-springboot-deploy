package com.example.springHibernate.repository;

import com.example.springHibernate.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long > {
}
