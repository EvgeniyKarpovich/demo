package com.example.registration.service;

public interface UserService {

    boolean checkIfTelNumberExists(String telNumber);

    boolean checkIfUserRegistered(String telNumber);
}
