package com.acme.eshop.domain;

import lombok.*;

import java.util.Objects;

@Data
public class Customer {
    private String email;
    private String firstname;
    private String lastname;
    private Integer age;
    private String address;
    private CustomerCategory customerCategory;
}
