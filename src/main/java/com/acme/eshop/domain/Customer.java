package com.acme.eshop.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Objects;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CUSTOMERS", indexes = {@Index(columnList = "email")})
@SequenceGenerator(name = "idGenerator", sequenceName = "PRODUCTS_SEQ", initialValue = 1, allocationSize = 1)
public class Customer extends BaseModel {

    @NotNull
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "{email.format}")
    @Column(length = 50, nullable = false, unique = true)
    private String email;

    @NotNull
    @Column(length = 20, nullable = false)
    private String firstname;

    @NotNull
    @Column(length = 30, nullable = false)
    private String lastname;

    @Min(value = 12, message = "{age.min}")
    @Max(value = 120, message = "{age.max}")
    private Integer age;

    @Column(length = 50)
    private String address;

    @NotNull
    @Enumerated(EnumType.ORDINAL)
    @Column(length = 10, nullable = false)
    private CustomerCategory customerCategory;
}
