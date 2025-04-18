package com.api.application.dtos.outputDTOS;

import com.api.core.enums.ROLE;
import com.api.core.model.Order;
import com.api.core.model.Payment;

import java.util.List;

public record UserOutputDTO(Long id, String nome, String email, ROLE role, List<Order> orders, List<Payment> payments) {
}
