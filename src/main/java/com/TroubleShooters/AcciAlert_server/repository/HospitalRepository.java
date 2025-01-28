package com.TroubleShooters.AcciAlert_server.repository;

import com.TroubleShooters.AcciAlert_server.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {


}
