package com.sk.microservice.restaurant.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name; // Name of the menu (e.g., Lunch Menu, Dinner Menu)
    private Boolean isAvailable;

    @ManyToOne
    private Restaurant restaurant; // Reference to the associated Restaurant

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<MenuItem> menuItems; // Collection of products in the menu
}