package com.example.project.uber.UberApp.services;

import com.example.project.uber.UberApp.dto.DriverDto;
import com.example.project.uber.UberApp.dto.RideDto;
import com.example.project.uber.UberApp.dto.RideRequestDto;
import com.example.project.uber.UberApp.dto.RiderDto;
import com.example.project.uber.UberApp.entities.Rider;
import com.example.project.uber.UberApp.entities.User;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();
    Rider createNewRider(User user);
}
