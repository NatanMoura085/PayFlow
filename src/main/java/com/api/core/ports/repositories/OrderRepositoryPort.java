package com.api.core.ports.repositories;

import com.api.application.dtos.inputDTOS.OrderInputDTO;
import com.api.application.dtos.outputDTOS.OrderOutputDTO;

import java.util.List;

public interface OrderRepositoryPort {
    List<OrderOutputDTO> getAllOrders();
    OrderOutputDTO createOrder(OrderInputDTO orderInputDTO);
    OrderOutputDTO updateOrder(Long id, OrderInputDTO orderInputDTO);
    void deleteOrder(Long id);

}
