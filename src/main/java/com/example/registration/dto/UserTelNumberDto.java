package com.example.registration.dto;

import jakarta.validation.constraints.Pattern;

public record UserTelNumberDto(
        @Pattern(regexp = "\\d{10}", message = "Ошибка: Неправильный формат данных! Введите 10 цифр.")
        String telNumber
) {
}
