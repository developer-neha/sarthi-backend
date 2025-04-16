package com.avviare.sarthi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avviare.sarthi.dto.WorkoutRequest;

public interface WorkoutRepository extends JpaRepository<WorkoutRequest, Long> {
}
