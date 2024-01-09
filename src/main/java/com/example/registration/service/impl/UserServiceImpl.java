package com.example.registration.service.impl;

import com.example.registration.exception.TelNumberNotFoundException;
import com.example.registration.exception.UserAlreadyRegisteredException;
import com.example.registration.repository.UserRepository;
import com.example.registration.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public boolean checkIfTelNumberExists(String telNumber) {
        var exists = userRepository.existsByTelNumber(telNumber);
        if (!exists) {
            throw new TelNumberNotFoundException("Пользователь с номером телефона +7 %s не найден".formatted(telNumber));
        }
        return true;
    }

    @Override
    public boolean checkIfUserRegistered(String telNumber) {
        var userAlreadyRegistered = userRepository.isUserWithTelNumberRegistered(telNumber);
        if (userAlreadyRegistered) {
            throw new UserAlreadyRegisteredException(
                    "Пользователь с номером телефона +7 %s уже зарегистрирован в приложении".formatted(telNumber));
        }
        return false;
    }
}
