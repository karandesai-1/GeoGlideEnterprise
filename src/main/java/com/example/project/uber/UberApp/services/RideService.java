package com.example.project.uber.UberApp.services;

import com.example.project.uber.UberApp.dto.RideRequestDto;
import com.example.project.uber.UberApp.entities.Driver;
import com.example.project.uber.UberApp.entities.Ride;
import com.example.project.uber.UberApp.entities.RideRequest;
import com.example.project.uber.UberApp.entities.Rider;
import com.example.project.uber.UberApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    Ride createNewRide(RideRequest rideRequest, Driver driver);

    Ride updateRideStatus(Ride ride, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Rider rider, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Driver driver, PageRequest pageRequest);
}
