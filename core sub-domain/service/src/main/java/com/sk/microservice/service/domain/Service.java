package com.sk.microservice.service.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId; // Reference to the User ID
    private Long restaurantId; // Reference to the Restaurant ID
    private LocalDateTime dateTime; // Date and time of the appointment
    private String status; // Status of the appointment (e.g., confirmed, canceled)
    private int numberOfGuests; // Number of guests for the appointment
}