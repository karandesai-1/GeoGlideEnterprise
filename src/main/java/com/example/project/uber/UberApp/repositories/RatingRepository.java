package com.example.project.uber.UberApp.repositories;

import com.example.project.uber.UberApp.entities.Driver;
import com.example.project.uber.UberApp.entities.Rating;
import com.example.project.uber.UberApp.entities.Ride;
import com.example.project.uber.UberApp.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findByRider(Rider rider);
    List<Rating> findByDriver(Driver driver);

    Optional<Rating> findByRide(Ride ride);
}
