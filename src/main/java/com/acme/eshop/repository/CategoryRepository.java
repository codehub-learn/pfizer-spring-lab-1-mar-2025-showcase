package com.acme.eshop.repository;

import com.acme.eshop.domain.Category;
import com.acme.eshop.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
