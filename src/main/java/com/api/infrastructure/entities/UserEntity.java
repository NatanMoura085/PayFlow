package com.api.infrastructure.entities;

import com.api.core.enums.ROLE;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserEntity {
    private Long id;
    private String nome;
    private String email;
    private ROLE role;

    private List<OrderEntity> orderEntityList;
    private List<PaymentEntity> paymentEntityList;
}
