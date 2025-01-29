package com.TroubleShooters.AcciAlert_server.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "alerts") // Custom table name
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrementing ID
    private Long id;

    @Column(nullable = false)
    private Long userId; // ID of the user associated with the alert

    @Column(nullable = false)
    private String gpsCoordinates; // GPS coordinates of the accident (latitude, longitude format)

    @Column(nullable = false)
    private LocalDateTime timestamp; // Timestamp of when the alert was created

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public String getGpsCoordinates() {
        return gpsCoordinates;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
