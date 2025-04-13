package com.api.application.dtos.inputDTOS;

import com.api.core.enums.ROLE;
import com.api.core.model.Order;
import com.api.core.model.Payment;

import java.util.List;

public record UserInputDTO(Long id, String nome, String email, ROLE role, List<Order> orders, List<Payment> payments) {
}
