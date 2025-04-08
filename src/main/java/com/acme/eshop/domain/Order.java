package com.acme.eshop.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Delegate;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDERS")
@SequenceGenerator(name = "idGenerator", sequenceName = "ORDER_SEQ", initialValue = 1, allocationSize = 1)
public class Order extends BaseModel {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Customer customer;
    private Date submitDate;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<OrderItem> orderItems;
    private PaymentMethod paymentMethod;
    private BigDecimal cost;
}
