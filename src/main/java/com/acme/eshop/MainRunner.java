package com.acme.eshop;

import com.acme.eshop.domain.Customer;
import com.acme.eshop.domain.CustomerCategory;
import com.acme.eshop.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class MainRunner implements CommandLineRunner {

    private final CustomerService customerService;

    @Override
    public void run(String... args) throws Exception {
        //log.error("MainRunner started");
        customerService.greet();
        //Customer customer = new Customer();
        //Customer customer = new Customer("2@gmail.com", "John", "Daniil", 36, "Athens 13th Av.", CustomerCategory.BUSINESS);
        Customer builtCustomer = Customer.builder().email("2@gmail.com").firstname("John").lastname("Daniil").age(36).address("Athens 13th Av.").customerCategory(CustomerCategory.BUSINESS).build();

    }
}
