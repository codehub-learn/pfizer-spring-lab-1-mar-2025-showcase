package com.acme.eshop.domain;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order extends BaseModel {
    private Customer customer;
    private Date submitDate;
    private Set<OrderItem> orderItems;
    private PaymentMethod paymentMethod;
    private BigDecimal cost;
}
