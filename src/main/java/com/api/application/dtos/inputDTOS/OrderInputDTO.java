package com.api.application.dtos.inputDTOS;

import com.api.infrastructure.entities.PaymentEntity;
import com.api.infrastructure.entities.UserEntity;

import java.time.LocalDateTime;

public record OrderInputDTO(String status, LocalDateTime createAt, Long userId
                            ) {
}
