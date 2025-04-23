package com.api.infrastructure.entities;

import com.api.application.dtos.inputDTOS.UserInputDTO;
import com.api.application.dtos.outputDTOS.UserOutputDTO;
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

    public UserEntity(UserInputDTO userInputDTO){
        this.nome = userInputDTO.nome();
        this.email = userInputDTO.email();
        this.role = userInputDTO.role();
    }

    public UserEntity(){

    }
}
