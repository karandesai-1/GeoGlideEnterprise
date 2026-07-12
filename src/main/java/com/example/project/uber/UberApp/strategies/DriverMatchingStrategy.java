package com.example.project.uber.UberApp.strategies;

import com.example.project.uber.UberApp.dto.RideRequestDto;
import com.example.project.uber.UberApp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {
    // Define the method signature for finding a matching driver
    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
