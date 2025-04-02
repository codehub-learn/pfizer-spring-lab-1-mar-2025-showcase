package com.acme.eshop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomerService {

    public void greet(){
        log.info("CustomerService greet");
    }
}
