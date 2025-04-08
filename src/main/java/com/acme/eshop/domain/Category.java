package com.acme.eshop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SequenceGenerator(name = "idGenerator", sequenceName = "CATEGORY_SEQ", initialValue = 1, allocationSize = 1)
public class Category extends BaseModel {
    @NotNull
    @Column(length = 50, nullable = false)
    private String description;
}
