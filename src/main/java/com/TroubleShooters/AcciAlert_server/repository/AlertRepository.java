package com.TroubleShooters.AcciAlert_server.repository;

import com.TroubleShooters.AcciAlert_server.model.Alert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlertRepository extends JpaRepository<Alert, Long> {

    List<Alert> findByUserId(Long userId);
}
