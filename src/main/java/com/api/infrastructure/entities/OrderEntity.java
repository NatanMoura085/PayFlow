package com.api.infrastructure.entities;

import com.api.application.dtos.inputDTOS.OrderInputDTO;
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
    private String status;
    private LocalDateTime createAt;
    @Column(name = "user_id")
    private String userId;

    public OrderEntity() {

    }

    public OrderEntity(OrderInputDTO orderInputDTO){
        this.status = orderInputDTO.status();
        this.createAt = orderInputDTO.createAt();
        this.userId = String.valueOf(orderInputDTO.userId());
    }
}
