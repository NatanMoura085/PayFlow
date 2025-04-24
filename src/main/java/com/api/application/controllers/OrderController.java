package com.api.application.controllers;

import com.api.application.dtos.inputDTOS.OrderInputDTO;
import com.api.application.dtos.outputDTOS.OrderOutputDTO;
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
    public ResponseEntity<OrderOutputDTO> createOrder(@RequestBody OrderInputDTO orderInputDTO) {
        return ResponseEntity.ok(orderService.createOrder(orderInputDTO));
    }
}
