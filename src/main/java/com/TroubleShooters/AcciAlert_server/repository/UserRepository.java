package com.TroubleShooters.AcciAlert_server.repository;

import com.TroubleShooters.AcciAlert_server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {

}
