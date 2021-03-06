package com.stk.ecom.java.academy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stk.ecom.java.academy.domain.CustomerEntity;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>{

}
