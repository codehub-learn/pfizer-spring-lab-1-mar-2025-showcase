package com.acme.eshop.repository;

import com.acme.eshop.domain.Order;
import com.acme.eshop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
