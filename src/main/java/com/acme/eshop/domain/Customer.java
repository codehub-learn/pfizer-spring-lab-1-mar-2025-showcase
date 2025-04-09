package com.acme.eshop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Objects;

@Data
@Entity
@Table(name = "CUSTOMERS")
public class Customer {
    @Id
    private Integer id;
    @Column(length = 150, unique = true, nullable = false)
    private String email;
    private String firstname;
    private String lastname;
    private Integer age;
    @Column(length = 50)
    private String address;
    private CustomerCategory customerCategory;
    private String phone;
}
