package com.api.infrastructure.entities;

import com.api.core.enums.ROLE;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Entity
@Table(name = "tb_user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    @Enumerated(EnumType.STRING)
    private ROLE role;

    @OneToMany(mappedBy = "userEntity",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<OrderEntity> orderEntityList;
    @OneToMany(mappedBy = "userEntity",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<PaymentEntity> paymentEntityList;
}
