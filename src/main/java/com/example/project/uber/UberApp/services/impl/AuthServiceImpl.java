package com.example.project.uber.UberApp.services.impl;

import com.example.project.uber.UberApp.dto.DriverDto;
import com.example.project.uber.UberApp.dto.SignupDto;
import com.example.project.uber.UberApp.dto.UserDto;
import com.example.project.uber.UberApp.services.AuthService;


public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
