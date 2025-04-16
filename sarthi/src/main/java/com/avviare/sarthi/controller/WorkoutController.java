package com.avviare.sarthi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avviare.sarthi.dto.WorkoutRequest;
import com.avviare.sarthi.service.WorkoutService;

@CrossOrigin(origins = "http://localhost:5173") // Adjust frontend port
@RestController
@RequestMapping("/api")
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;

    @PostMapping("/workouts")
    public ResponseEntity<WorkoutRequest> saveWorkout(@RequestBody WorkoutRequest request) {
        WorkoutRequest saved = workoutService.saveWorkout(request);
        return ResponseEntity.ok(saved);
    }
}
