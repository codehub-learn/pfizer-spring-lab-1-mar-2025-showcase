package com.acme.eshop.domain;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem extends BaseModel {
    private Product product;
    private Order order;
    private Integer quantity;
    private BigDecimal price;
}
