package com.example.project.uber.UberApp.services.impl;

import com.example.project.uber.UberApp.entities.Payment;
import com.example.project.uber.UberApp.entities.Ride;
import com.example.project.uber.UberApp.entities.enums.PaymentStatus;
import com.example.project.uber.UberApp.exceptions.ResourceNotFoundException;
import com.example.project.uber.UberApp.repositories.PaymentRepository;
import com.example.project.uber.UberApp.services.PaymentService;
import com.example.project.uber.UberApp.strategies.PaymentStrategyManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final PaymentStrategyManager paymentStrategyManager;

    @Override
    public void processPayment(Ride ride) {
        Payment payment = paymentRepository.findByRide(ride)
                .orElseThrow(() -> new ResourceNotFoundException("Payment not found for ride with id: "+ride.getId()));
        paymentStrategyManager.paymentStrategy(payment.getPaymentMethod()).processPayment(payment);
    }

    @Override
    public Payment createNewPayment(Ride ride) {
        return null;
    }

    @Override
    public void updatePaymentStatus(Payment payment, PaymentStatus status) {

    }
}
