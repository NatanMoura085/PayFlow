package com.api.application.controllers;

import com.api.application.dtos.inputDTOS.OrderInputDTO;
import com.api.application.dtos.outputDTOS.OrderOutputDTO;
import com.api.infrastructure.adapters.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/order")
    public List<OrderOutputDTO> getAllOrders() {
        return orderService.getAllOrders();
    }
    @PostMapping("/order")
    public ResponseEntity<OrderOutputDTO> createOrder(@RequestBody OrderInputDTO orderInputDTO) {
        return ResponseEntity.ok(orderService.createOrder(orderInputDTO));
    }
    @PutMapping("/order/{id}")
    public OrderOutputDTO updateOrder(@PathVariable Long id, OrderInputDTO orderInputDTO){
        return orderService.updateOrder(id,orderInputDTO);

    }
    @DeleteMapping("/order/{id}")
    public void deleteOrder(@PathVariable Long id){
        orderService.deleteOrder(id);
    }
}
