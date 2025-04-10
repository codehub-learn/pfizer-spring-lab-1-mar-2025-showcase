package com.acme.eshop;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        //log.info("Main started");
        //log.warn("Main started");
        //log.debug("Main started");
        SpringApplication.run(Main.class, args);
    }
}