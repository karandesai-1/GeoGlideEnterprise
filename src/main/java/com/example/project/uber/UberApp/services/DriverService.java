package com.example.project.uber.UberApp.services;

import com.example.project.uber.UberApp.dto.DriverDto;
import com.example.project.uber.UberApp.dto.RideDto;
import com.example.project.uber.UberApp.dto.RiderDto;
import com.example.project.uber.UberApp.entities.Driver;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId , String otp);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    Page<RideDto> getAllMyRides(PageRequest pageRequest);

    Driver getCurrentDriver();

    Driver updateDriverAvailability(Driver driver, boolean available);
}
