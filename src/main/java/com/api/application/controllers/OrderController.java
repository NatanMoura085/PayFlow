package com.api.application.controllers;

import com.api.application.dtos.inputDTOS.OrderInputDTO;
import com.api.infrastructure.adapters.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/order")
    public ResponseEntity<?> createOrder(@RequestBody OrderInputDTO orderInputDTO) {
        orderService.createOrder(orderInputDTO);
        return ResponseEntity.ok(orderInputDTO);
    }
}
