package com.acme.eshop.domain;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseModel {
    private String serial;
    private String name;
    private BigDecimal price;
    private Category category;
}
