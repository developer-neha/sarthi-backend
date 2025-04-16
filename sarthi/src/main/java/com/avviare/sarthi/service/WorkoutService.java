package com.avviare.sarthi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avviare.sarthi.dto.WorkoutRequest;
import com.avviare.sarthi.repository.WorkoutRepository;

@Service
public class WorkoutService {

	@Autowired
	private WorkoutRepository workoutRepository;
	
    public WorkoutRequest saveWorkout(WorkoutRequest request) {
        return workoutRepository.save(request);
    }
}
