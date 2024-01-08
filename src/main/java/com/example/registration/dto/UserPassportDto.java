package com.example.registration.dto;

import jakarta.validation.constraints.NotBlank;

public record UserPassportDto(
        @NotBlank(message = "введите номер пасспорта")
        String passportNumber
) {
}
