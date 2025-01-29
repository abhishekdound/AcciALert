package com.TroubleShooters.AcciAlert_server.controller;

import com.TroubleShooters.AcciAlert_server.model.Hospital;
import com.TroubleShooters.AcciAlert_server.service.HospitalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hospitals")
public class HospitalController {
    private final HospitalService hospitalService;

    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    // Get all hospitals
    @GetMapping
    public ResponseEntity<List<Hospital>> getAllHospitals() {
        List<Hospital> hospitals = hospitalService.getAllHospitals();
        return ResponseEntity.ok(hospitals);
    }

    // Get hospital by ID
    @GetMapping("/{id}")
    public ResponseEntity<Hospital> getHospitalById(@PathVariable Long id) {
        Optional<Hospital> hospital = hospitalService.getHospitalById(id);
        return hospital.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Add new hospital
    @PostMapping
    public ResponseEntity<Hospital> addHospital(@RequestBody Hospital hospital) {
        Hospital savedHospital = hospitalService.addHospital(hospital);
        return ResponseEntity.ok(savedHospital);
    }

    // Update hospital by ID
    @PutMapping("/{id}")
    public ResponseEntity<Hospital> updateHospital(@PathVariable Long id, @RequestBody Hospital updatedHospital) {
        Hospital hospital = hospitalService.updateHospital(id, updatedHospital);
        return (hospital != null) ? ResponseEntity.ok(hospital) : ResponseEntity.notFound().build();
    }

    // Delete hospital by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHospital(@PathVariable Long id) {
        return hospitalService.deleteHospital(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
