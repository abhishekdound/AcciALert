package com.TroubleShooters.AcciAlert_server.service;

import com.TroubleShooters.AcciAlert_server.model.Alert;
import com.TroubleShooters.AcciAlert_server.repository.AlertRepository;
import org.springframework.stereotype.Service;

@Service
public class AlertService {

    private final AlertRepository alertRepository;

    public AlertService(AlertRepository alertRepository) {
        this.alertRepository = alertRepository;
    }

    // Save the received alert to the database
    public Alert saveAlert(Alert alert) {
        return alertRepository.save(alert);
    }
}
