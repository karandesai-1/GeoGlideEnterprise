package com.example.project.uber.UberApp.strategies.impl;

import com.example.project.uber.UberApp.entities.Driver;
import com.example.project.uber.UberApp.entities.RideRequest;
import com.example.project.uber.UberApp.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return List.of();
    }
}
