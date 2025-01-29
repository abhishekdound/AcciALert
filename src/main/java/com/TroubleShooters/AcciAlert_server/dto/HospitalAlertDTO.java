package com.TroubleShooters.AcciAlert_server.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HospitalAlertDTO {

    private Long userId;  // User ID
    private String userName;  // User's name
    private String gender;  // User's gender
    private String dateOfBirth;  // User's date of birth
    private String bloodGroup;  // User's blood group
    private String permanentAddress; // User's permanent address
    private String vehicleNumber;  // Vehicle number
    private String vehicleModel;  // Vehicle model
    private String vehicleType;  // Type of vehicle
    private String gpsCoordinates;  // Accident location (latitude, longitude)
    private LocalDateTime timestamp; // Time of accident

    public HospitalAlertDTO(Long userId, String userName, String gender, String dateOfBirth, String bloodGroup, String permanentAddress, String vehicleNumber, String vehicleModel, String vehicleType, String gpsCoordinates, LocalDateTime timestamp) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.bloodGroup = bloodGroup;
        this.permanentAddress = permanentAddress;
        this.vehicleNumber = vehicleNumber;
        this.vehicleModel = vehicleModel;
        this.vehicleType = vehicleType;
        this.gpsCoordinates = gpsCoordinates;
        this.timestamp = timestamp;
    }
}
