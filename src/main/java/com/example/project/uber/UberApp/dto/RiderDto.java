package com.example.project.uber.UberApp.dto;

import com.example.project.uber.UberApp.entities.enums.PaymentMethod;
import com.example.project.uber.UberApp.entities.enums.RideStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RiderDto {

    private UserDto user;
    private Double rating;
}
