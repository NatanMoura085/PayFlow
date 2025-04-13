package com.api.core.ports.interfaces;

import com.api.application.dtos.inputDTOS.OrderInputDTO;
import com.api.application.dtos.outputDTOS.OrderOutputDTO;

public interface OrderServicePort {
    OrderOutputDTO createOrder(OrderInputDTO orderInputDTO);

    OrderOutputDTO getOrderById(Long id);

    OrderOutputDTO updateOrderStatus(Long id, String status);
}
