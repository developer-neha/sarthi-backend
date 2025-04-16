package com.avviare.sarthi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avviare.sarthi.dto.CallbackRequest;
import com.avviare.sarthi.service.CallbackRequestService;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class CallbackRequestController {

    @Autowired
    private CallbackRequestService callbackRequestService;

    @PostMapping("/callback-requests")
    public ResponseEntity<CallbackRequest> createCallbackRequest(@RequestBody CallbackRequest request) {
        System.out.println("Received Request: " + request.getName() + ", " + request.getMobile() + ", " + request.getEmail());
        CallbackRequest savedRequest = callbackRequestService.save(request);
        return ResponseEntity.ok(savedRequest);
    }
}