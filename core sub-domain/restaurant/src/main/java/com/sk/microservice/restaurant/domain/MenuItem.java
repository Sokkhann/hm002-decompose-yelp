package com.sk.microservice.restaurant.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // Name of the product (e.g., Pizza Margherita)
    private String description; // Description of the product
    private BigDecimal price; // Price of the product
    private Boolean isAvailable;

    @ManyToOne
    private Menu menu; // Reference to the Menu it belongs to
}