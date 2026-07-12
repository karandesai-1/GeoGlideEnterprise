package com.example.project.uber.UberApp.strategies;

import com.example.project.uber.UberApp.dto.RideRequestDto;

public interface RideFareCalulationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);
}
