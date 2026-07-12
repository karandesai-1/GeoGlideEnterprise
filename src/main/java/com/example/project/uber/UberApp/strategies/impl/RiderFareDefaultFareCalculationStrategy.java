package com.example.project.uber.UberApp.strategies.impl;

import com.example.project.uber.UberApp.dto.RideRequestDto;
import com.example.project.uber.UberApp.strategies.RideFareCalulationStrategy;

public class RiderFareDefaultFareCalculationStrategy implements RideFareCalulationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
