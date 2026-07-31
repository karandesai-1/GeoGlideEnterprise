package com.example.project.uber.UberApp.repositories;

import com.example.project.uber.UberApp.entities.Payment;
import com.example.project.uber.UberApp.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Optional<Payment> findByRide(Ride ride);
}
