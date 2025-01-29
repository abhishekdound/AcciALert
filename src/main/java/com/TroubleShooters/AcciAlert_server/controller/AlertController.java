package com.TroubleShooters.AcciAlert_server.controller;

import com.TroubleShooters.AcciAlert_server.model.Alert;
import com.TroubleShooters.AcciAlert_server.service.AlertService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alerts")
@CrossOrigin("*") // Allow frontend access
public class AlertController {

    private final AlertService alertService;

    public AlertController(AlertService alertService) {
        this.alertService = alertService;
    }

    // Endpoint to receive an alert from frontend and save it
    @PostMapping
    public Alert receiveAlert(@RequestBody Alert alert) {
        return alertService.saveAlert(alert);
    }
}
