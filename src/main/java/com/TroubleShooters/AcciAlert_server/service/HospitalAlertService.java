package com.TroubleShooters.AcciAlert_server.service;

import com.TroubleShooters.AcciAlert_server.dto.HospitalAlertDTO;
import com.TroubleShooters.AcciAlert_server.model.Alert;
import com.TroubleShooters.AcciAlert_server.model.User;
import com.TroubleShooters.AcciAlert_server.repository.AlertRepository;
import com.TroubleShooters.AcciAlert_server.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HospitalAlertService {
    private final AlertRepository alertRepository;
    private final UserRepository userRepository;

    public HospitalAlertService(AlertRepository alertRepository, UserRepository userRepository) {
        this.alertRepository = alertRepository;
        this.userRepository = userRepository;
    }

    // Fetch all alerts and map them to HospitalAlertDTO
    public List<HospitalAlertDTO> getAllHospitalAlerts() {
        List<Alert> alerts = alertRepository.findAll();

        return alerts.stream()
                .map(alert -> { // ✅ Using explicit lambda type
                    User user = userRepository.findById(alert.getUserId()).orElse(null);

                    return new HospitalAlertDTO(
                            alert.getUserId(),
                            (user != null) ? user.getName() : "Unknown",
                            (user != null) ? user.getGender() : "Unknown",
                            (user != null) ? user.getDateOfBirth() : "Unknown",
                            (user != null) ? user.getBloodGroup() : "Unknown",
                            (user != null) ? user.getPermanentAddress() : "Unknown",
                            (user != null) ? user.getVehicleNumber() : "Unknown",
                            (user != null) ? user.getVehicleModel() : "Unknown",
                            (user != null) ? user.getVehicleType() : "Unknown",
                            alert.getGpsCoordinates(),
                            alert.getTimestamp()
                    );
                })
                .collect(Collectors.toList());
    }
}
