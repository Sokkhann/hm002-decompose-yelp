package com.sk.microservice.review.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comment; // Review comment
    private int rating; // Numerical rating (e.g., 1 to 5)

    @ManyToOne
    private Product product; // Reference to the Product being reviewed

    @ManyToOne
    private User user; // Reference to the User who wrote the review
}