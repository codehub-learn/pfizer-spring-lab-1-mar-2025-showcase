package com.acme.eshop.domain;

import java.math.BigDecimal;

public class OrderItem {
    private Product product;
    private Order order;
    private Integer quantity;
    private BigDecimal price;
}
