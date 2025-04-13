package com.api.infrastructure.entities;

import com.api.core.enums.PaymentStatus;
import com.api.core.model.Order;
import com.api.core.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaymentEntity {
    private Long id;

    private Long userId;

    private Double amount;
    private PaymentStatus status;

    private UserEntity userEntity;
    private OrderEntity orderEntity;


}
