package com.api.application.dtos.inputDTOS;

import com.api.core.enums.ROLE;

public record UserInputDTO(String nome, String email, ROLE role
) {
}
