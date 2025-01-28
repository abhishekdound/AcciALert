package com.TroubleShooters.AcciAlert_server.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "alerts") // Custom table name
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrementing ID
    private Long id;

    @Column(nullable = false)
    private Long userId; // ID of the user associated with the alert

    @Column(nullable = false)
    private String gpsCoordinates; // GPS coordinates of the accident (latitude, longitude format)

    @Column(nullable = false)
    private String timestamp; // Timestamp of when the alert was created (formatted as a string)
}
