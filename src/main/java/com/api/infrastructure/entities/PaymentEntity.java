package com.api.infrastructure.entities;

import com.api.core.enums.PaymentMethod;
import com.api.core.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Entity
@Table(name = "tb_payment")
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private PaymentStatus status;
    private LocalDateTime paymentDate;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderEntity orderEntity;


}
