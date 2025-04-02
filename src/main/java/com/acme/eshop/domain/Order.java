package com.acme.eshop.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class Order {
    private Customer customer;
    private Date submitDate;
    private Set<OrderItem> orderItems;
    private PaymentMethod paymentMethod;
    private BigDecimal cost;
}
