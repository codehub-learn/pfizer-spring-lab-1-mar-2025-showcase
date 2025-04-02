package com.acme.eshop;

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
        log.error("MainRunner started");
        customerService.greet();
    }
}
