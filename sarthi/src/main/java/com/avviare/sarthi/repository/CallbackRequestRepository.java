package com.avviare.sarthi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avviare.sarthi.dto.CallbackRequest;

public interface CallbackRequestRepository extends JpaRepository<CallbackRequest, Long>{

}
