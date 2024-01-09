package com.example.registration.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record SmsCodeDto(
        @NotBlank(message = "Введите код из СМС")
        @Pattern(regexp = "\\d{6}", message = "Any")
        String code) {

}
