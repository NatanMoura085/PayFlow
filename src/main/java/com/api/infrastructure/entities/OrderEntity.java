package com.api.infrastructure.entities;

import com.api.core.model.Payment;
import com.api.core.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class OrderEntity {
    private Long id;
    private Long paymentId;
    private String status;
    private LocalDateTime createAt;

    private UserEntity userEntity;
    private PaymentEntity paymentEntity;
}
