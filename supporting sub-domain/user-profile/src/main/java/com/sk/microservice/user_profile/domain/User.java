package com.sk.microservice.user_profile.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username; // User's chosen username
    private String email; // User's email address
    private String passwordHash; // Hashed password for authentication
    private String firstName; // User's first name
    private String lastName; // User's last name
    private String profilePicture;
}
