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
    @Column(name = "user_id")
    private String userId;

    @Column(name = "order_id")
    private Long orderId;


}
