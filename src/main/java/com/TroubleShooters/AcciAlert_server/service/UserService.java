package com.TroubleShooters.AcciAlert_server.service;

import com.TroubleShooters.AcciAlert_server.model.User;
import com.TroubleShooters.AcciAlert_server.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Fetch all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Fetch a user by ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Add a new user
    public User addUser(User user) {
        return userRepository.save(user);
    }

    // Update an existing user
    public User updateUser(Long id, User updatedUser) {
        return userRepository.findById(id).map(user -> {
            user.setVehicleNumber(updatedUser.getVehicleNumber());
            user.setVehicleModel(updatedUser.getVehicleModel());
            user.setVehicleType(updatedUser.getVehicleType());
            user.setEmergencyContacts(updatedUser.getEmergencyContacts());
            user.setName(updatedUser.getName());
            user.setGender(updatedUser.getGender());
            user.setDateOfBirth(updatedUser.getDateOfBirth());
            user.setBloodGroup(updatedUser.getBloodGroup());
            user.setAadhaarNumber(updatedUser.getAadhaarNumber());
            user.setPermanentAddress(updatedUser.getPermanentAddress());
            return userRepository.save(user);
        }).orElse(null);
    }

    // Delete a user by ID
    public boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
