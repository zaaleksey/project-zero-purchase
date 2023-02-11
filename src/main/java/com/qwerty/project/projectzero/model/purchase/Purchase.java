package com.qwerty.project.projectzero.model.purchase;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "purchase")
public class Purchase {
    @Id
    private Integer id;
    private String name;
    private PurchaseType type;
    private BigDecimal price;
    private LocalDateTime dateTime;
}
