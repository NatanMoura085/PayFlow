package com.api.application.dtos.outputDTOS;

import com.api.core.enums.PaymentMethod;
import com.api.core.enums.PaymentStatus;

import java.time.LocalDateTime;

public record PaymentOutputDTO(Double amount, PaymentStatus status, LocalDateTime paymentDate,
                               PaymentMethod paymentMethod, Long orderId) {
}
