package com.example.project.uber.UberApp.services;

import com.example.project.uber.UberApp.entities.RideRequest;

public interface RideRequestService {
    RideRequest findRideRequestById(Long rideRequestId);

    void update(RideRequest rideRequest);
}
