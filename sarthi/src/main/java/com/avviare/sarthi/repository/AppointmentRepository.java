package com.avviare.sarthi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avviare.sarthi.dto.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
