package com.api.infrastructure.entities;

import com.api.application.dtos.inputDTOS.PaymentInputDTO;
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
    @Column(name = "order_id")
    private Long orderId;

    public PaymentEntity() {

    }

    public PaymentEntity(PaymentInputDTO paymentInputDTO) {
        this.amount = paymentInputDTO.amount();
        this.status = paymentInputDTO.status();
        this.paymentDate = paymentInputDTO.paymentDate();
        this.paymentMethod = paymentInputDTO.paymentMethod();
        this.orderId = paymentInputDTO.orderId();
    }

}
