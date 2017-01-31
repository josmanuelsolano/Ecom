package com.stk.ecom.java.academy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stk.ecom.java.academy.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
