package com.example.project.uber.UberApp.entities;

import com.example.project.uber.UberApp.entities.enums.PaymentType;
import com.example.project.uber.UberApp.entities.enums.RideRequestStatus;
import com.example.project.uber.UberApp.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "geometry(Point, 4326)")
    private Point pickupLocation;
    @Column(columnDefinition = "geometry(Point, 4326)")
    private Point dropoffLocation;

    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;

    @ManyToOne(fetch = FetchType.LAZY)
    private Driver driver;

    @CreationTimestamp
    private LocalDateTime requestCreationTime;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;

    private String otp;

    private Double fare;
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;
}
