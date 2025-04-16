package com.avviare.sarthi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avviare.sarthi.dto.CallbackRequest;
import com.avviare.sarthi.repository.CallbackRequestRepository;

@Service
public class CallbackRequestService {

    @Autowired
    private CallbackRequestRepository repository;

    public CallbackRequest save(CallbackRequest request) {
        return repository.save(request);
    }
}
