package com.example.registration.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record UserPassportDto(
        @NotBlank(message = "введите номер пасспорта")
        @Pattern(regexp = "\\d{10}", message = "Any")
        String passportNumber
) {
}
