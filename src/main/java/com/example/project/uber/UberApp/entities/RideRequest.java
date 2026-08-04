package com.example.project.uber.UberApp.entities;

import com.example.project.uber.UberApp.entities.enums.PaymentType;
import com.example.project.uber.UberApp.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(
        indexes = {
                @Index(name = "idx_ride_request_rider", columnList = "rider_id")
        }
)
public class RideRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "geometry(Point, 4326)")
    private Point pickupLocation;
    @Column(columnDefinition = "geometry(Point, 4326)")
    private Point dropOffLocation;

    @CreationTimestamp
    private LocalDateTime requestCreationTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;

    private Double fare;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @Enumerated(EnumType.STRING)
    private RideRequestStatus rideRequestStatus;
}
