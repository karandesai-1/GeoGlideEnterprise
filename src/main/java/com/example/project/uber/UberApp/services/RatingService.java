package com.example.project.uber.UberApp.services;

import com.example.project.uber.UberApp.dto.DriverDto;
import com.example.project.uber.UberApp.dto.RiderDto;
import com.example.project.uber.UberApp.entities.Ride;

public interface RatingService {

    DriverDto rateDriver(Ride ride, Integer rating);
    RiderDto rateRider(Ride ride, Integer rating);

    void createNewRating(Ride ride);
}
