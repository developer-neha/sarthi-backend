package com.avviare.sarthi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avviare.sarthi.dto.Appointment;
import com.avviare.sarthi.service.AppointmentService;

@RestController
@RequestMapping("/appointments")
@CrossOrigin(origins = "http://localhost:5173") // Allow frontend access
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    // Save new appointment
    @PostMapping("/book")
    public ResponseEntity<Appointment> bookAppointment(@RequestBody Appointment appointment) {
        Appointment savedAppointment = appointmentService.saveAppointment(appointment);
        return ResponseEntity.ok(savedAppointment);
    }

    // Get all appointments
    @GetMapping("/all")
    public ResponseEntity<List<Appointment>> getAllAppointments() {
        return ResponseEntity.ok(appointmentService.getAllAppointments());
    }
}

