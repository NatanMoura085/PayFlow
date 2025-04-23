package com.api.application.dtos.inputDTOS;

import com.api.core.enums.ROLE;

public record UserInputDTO(Long id, String nome, String email, ROLE role
) {
}
