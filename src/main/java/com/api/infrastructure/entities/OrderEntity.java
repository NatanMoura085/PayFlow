package com.api.infrastructure.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Entity
@Table(name = "tb_order")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long paymentId;
    private String status;
    private LocalDateTime createAt;
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;
    @OneToOne
    @JoinColumn(name = "payment_id")
    private PaymentEntity paymentEntity;
}
