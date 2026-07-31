package com.example.project.uber.UberApp.services.impl;

import com.example.project.uber.UberApp.dto.DriverDto;
import com.example.project.uber.UberApp.dto.SignupDto;
import com.example.project.uber.UberApp.dto.UserDto;
import com.example.project.uber.UberApp.entities.User;
import com.example.project.uber.UberApp.entities.enums.Role;
import com.example.project.uber.UberApp.exceptions.RuntimeConflictException;
import com.example.project.uber.UberApp.repositories.UserRepository;
import com.example.project.uber.UberApp.services.AuthService;
import com.example.project.uber.UberApp.services.RiderService;
import com.example.project.uber.UberApp.services.WalletService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final RiderService riderService;
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final WalletService  walletService;

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        User user = userRepository.findByEmail(signupDto.getEmail()).orElse(null);
        if(user != null)
            throw new RuntimeConflictException("Cannot signup, User already exists with email "+signupDto.getEmail());

        User mappedUser = modelMapper.map(signupDto, User.class);
        mappedUser.setRoles(Set.of(Role.RIDER));
        User savedUser = userRepository.save(mappedUser);

//        create user related entities
        riderService.createNewRider(savedUser);
        walletService.createNewWallet(savedUser);

        return modelMapper.map(savedUser, UserDto.class);
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
