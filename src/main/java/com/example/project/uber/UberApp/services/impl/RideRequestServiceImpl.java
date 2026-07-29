package com.example.project.uber.UberApp.services.impl;

import com.example.project.uber.UberApp.entities.RideRequest;
import com.example.project.uber.UberApp.repositories.RideRequestRepository;
import com.example.project.uber.UberApp.services.RideRequestService;
import org.springframework.stereotype.Service;

@Service
public class RideRequestServiceImpl implements RideRequestService {

    private RideRequestRepository rideRequestRepository;

    @Override
    public RideRequest findRideRequestById(Long rideRequestId) {
        return rideRequestRepository.findById(rideRequestId).orElseThrow(() -> new RuntimeException("RideRequest not found"));
    }

    @Override
    public void update(RideRequest rideRequest) {
        rideRequestRepository.findById(rideRequest.getId()).orElseThrow(() -> new RuntimeException("RideRequest not found"));
        rideRequestRepository.save(rideRequest);

    }
}
