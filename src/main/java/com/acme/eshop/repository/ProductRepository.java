package com.acme.eshop.repository;

import com.acme.eshop.domain.Customer;
import com.acme.eshop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
