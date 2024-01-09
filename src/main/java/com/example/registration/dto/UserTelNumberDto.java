package com.example.registration.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record UserTelNumberDto(
        // ToDo: need add i18n
        @NotBlank(message = "Введите номер телефона")
        @Pattern(regexp = "\\d{10}", message = "Ошибка: Неправильный формат данных! Введите 10 цифр.")
        String telNumber
) {
}
