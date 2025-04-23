package com.api.application.dtos.inputDTOS;

import com.api.infrastructure.entities.PaymentEntity;
import com.api.infrastructure.entities.UserEntity;

import java.time.LocalDateTime;

public record OrderInputDTO(Long id, String status, LocalDateTime createAt, String userId,
                            String paymentId) {
}
