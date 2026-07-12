package com.example.project.uber.UberApp.repositories;

import com.example.project.uber.UberApp.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepository extends JpaRepository<Ride, Long> {
}
