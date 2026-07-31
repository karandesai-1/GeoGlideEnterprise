package com.example.project.uber.UberApp.services;

import com.example.project.uber.UberApp.dto.WalletDto;
import com.example.project.uber.UberApp.entities.Ride;
import com.example.project.uber.UberApp.entities.User;
import com.example.project.uber.UberApp.entities.Wallet;
import com.example.project.uber.UberApp.entities.enums.TransactionMethod;

public interface WalletService {

    Wallet addMoneyToWallet(User user, Double amount,
                            String transactionId, Ride ride,
                            TransactionMethod transactionMethod);

    Wallet deductMoneyFromWallet(User user, Double amount,
                                 String transactionId, Ride ride,
                                 TransactionMethod transactionMethod);

    void withdrawAllMyMoneyFromWallet();

    Wallet findWalletById(Long walletId);

    Wallet createNewWallet(User user);

    Wallet findByUser(User user);

}
