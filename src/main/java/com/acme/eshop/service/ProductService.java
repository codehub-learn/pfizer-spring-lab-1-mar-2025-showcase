package com.acme.eshop.service;

import com.acme.eshop.domain.Customer;
import com.acme.eshop.domain.Product;
import com.acme.eshop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
public class ProductService {

    private final ProductRepository productRepository;

    public void save(Product product){
        productRepository.save(product);
    }
}
