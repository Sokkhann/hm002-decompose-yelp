package com.sk.microservice.media.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url; // URL of the media file
    private String type; // Type of media (e.g., image, video)
    private String description; // Description of the media
}
