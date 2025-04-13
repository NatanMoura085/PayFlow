package com.api.application.dtos.inputDTOS;

import com.api.core.model.Payment;
import com.api.core.model.User;

import java.time.LocalDateTime;

public record OrderInputDTO(Long id, Long paymentId, String status, LocalDateTime createAt, User user,Payment payment) {
}
