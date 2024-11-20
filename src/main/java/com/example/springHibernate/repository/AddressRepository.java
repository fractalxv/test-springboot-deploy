package com.example.springHibernate.repository;

import com.example.springHibernate.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
