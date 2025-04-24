package com.api.application.dtos.outputDTOS;

import com.api.infrastructure.entities.UserEntity;

import java.time.LocalDateTime;

public record OrderOutputDTO(String status, LocalDateTime createAt, UserEntity userEntity) {
}
