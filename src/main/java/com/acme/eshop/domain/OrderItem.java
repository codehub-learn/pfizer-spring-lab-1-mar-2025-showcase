package com.acme.eshop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SequenceGenerator(name = "idGenerator", sequenceName = "ORDER_ITEM_SEQ", initialValue = 1, allocationSize = 1)
public class OrderItem extends BaseModel {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Product product;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Order order;
    private Integer quantity;
    private BigDecimal price;
}
