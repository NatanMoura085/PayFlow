package com.api.application.dtos.inputDTOS;

import com.api.core.enums.PaymentMethod;
import com.api.core.enums.PaymentStatus;

import java.time.LocalDateTime;

public record PaymentInputDTO(Double amount, PaymentStatus status, LocalDateTime paymentDate,
                              PaymentMethod paymentMethod,Long orderId) {
}
