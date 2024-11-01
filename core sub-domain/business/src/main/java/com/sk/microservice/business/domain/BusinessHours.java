package com.sk.microservice.business.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
public class BusinessHours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Business business;

    private String dayOfWeek; // E.g., "Monday", "Tuesday"
    private LocalTime openingTime;
    private LocalTime closingTime;
}