package com.TroubleShooters.AcciAlert_server.controller;


import com.TroubleShooters.AcciAlert_server.dto.HospitalAlertDTO;
import com.TroubleShooters.AcciAlert_server.service.HospitalAlertService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hospital-alerts")
@CrossOrigin("*") // Allow frontend access (optional)
public class HospitalAlertController {

    private final HospitalAlertService hospitalAlertService;

    public HospitalAlertController(HospitalAlertService hospitalAlertService) {
        this.hospitalAlertService = hospitalAlertService;
    }

    // Endpoint to get all hospital alerts
    @GetMapping
    public List<HospitalAlertDTO> getAllHospitalAlerts() {
        return hospitalAlertService.getAllHospitalAlerts();
    }
}
