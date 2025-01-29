package com.TroubleShooters.AcciAlert_server.service;

import com.TroubleShooters.AcciAlert_server.model.Hospital;
import com.TroubleShooters.AcciAlert_server.repository.HospitalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalService {
    private final HospitalRepository hospitalRepository;

    public HospitalService(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    // Fetch all hospitals
    public List<Hospital> getAllHospitals() {
        return hospitalRepository.findAll();
    }

    // Fetch a hospital by ID
    public Optional<Hospital> getHospitalById(Long id) {
        return hospitalRepository.findById(id);
    }

    // Add a new hospital
    public Hospital addHospital(Hospital hospital) {
        return hospitalRepository.save(hospital);
    }

    // Update an existing hospital
    public Hospital updateHospital(Long id, Hospital updatedHospital) {
        return hospitalRepository.findById(id).map(hospital -> {
            hospital.setHospitalAddress(updatedHospital.getHospitalAddress());
            hospital.setHospitalPincode(updatedHospital.getHospitalPincode());
            hospital.setPhoneNo(updatedHospital.getPhoneNo());
            hospital.setGpsCoordinates(updatedHospital.getGpsCoordinates());
            return hospitalRepository.save(hospital);
        }).orElse(null);
    }

    // Delete a hospital by ID
    public boolean deleteHospital(Long id) {
        if (hospitalRepository.existsById(id)) {
            hospitalRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
