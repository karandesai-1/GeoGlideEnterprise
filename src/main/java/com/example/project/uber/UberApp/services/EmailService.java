package com.example.project.uber.UberApp.services;

public interface EmailService {
    void sendEmail(String toEmail, String subject, String body);

    void sendEmail(String toEmail[], String subject, String body);
}
