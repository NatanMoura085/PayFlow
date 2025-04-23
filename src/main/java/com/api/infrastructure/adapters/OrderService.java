package com.api.infrastructure.adapters;

import com.api.application.dtos.inputDTOS.OrderInputDTO;
import com.api.application.dtos.outputDTOS.OrderOutputDTO;
import com.api.core.ports.repositories.OrderRepositoryPort;
import com.api.infrastructure.entities.OrderEntity;
import com.api.infrastructure.repository.SpringRepositoryOrder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService implements OrderRepositoryPort {
    private SpringRepositoryOrder repositoryOrder;

    public OrderService(SpringRepositoryOrder springRepositoryOrder) {
        this.repositoryOrder = springRepositoryOrder;
    }

    @Override
    public List<OrderOutputDTO> getAllOrders() {
        repositoryOrder.findAll();
        return null;
    }

    @Override
    public void createOrder(OrderInputDTO orderInputDTO) {
        OrderEntity orderEntity = new OrderEntity(orderInputDTO);
        repositoryOrder.save(orderEntity);
    }
}
