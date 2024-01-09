package com.example.registration.controller;

import com.example.registration.dto.UserTelNumberDto;
import com.example.registration.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
@RequiredArgsConstructor
public class RegistrationController {

    private UserService userService;

    @PostMapping()
    public ResponseEntity<?> checkTelNumber(@Valid @RequestBody UserTelNumberDto userTelNumberDto) {
        userService.checkIfTelNumberExists(userTelNumberDto.telNumber());
        userService.checkIfUserRegistered()
        return ResponseEntity.ok("Телефон корректный");
    }
}
