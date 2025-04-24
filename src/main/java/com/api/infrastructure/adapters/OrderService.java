package com.api.infrastructure.adapters;

import com.api.application.dtos.inputDTOS.OrderInputDTO;
import com.api.application.dtos.outputDTOS.OrderOutputDTO;
import com.api.core.ports.repositories.OrderRepositoryPort;
import com.api.infrastructure.entities.OrderEntity;
import com.api.infrastructure.entities.UserEntity;
import com.api.infrastructure.repository.SpringRepositoryOrder;
import com.api.infrastructure.repository.SpringRepositoryUser;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrderService implements OrderRepositoryPort {
    private SpringRepositoryOrder repositoryOrder;
    private SpringRepositoryUser RepositoryUser;

    public OrderService(SpringRepositoryOrder springRepositoryOrder,SpringRepositoryUser springRepositoryUser) {
        this.repositoryOrder = springRepositoryOrder;
        this.RepositoryUser =springRepositoryUser;
    }

    @Override
    public List<OrderOutputDTO> getAllOrders() {
        repositoryOrder.findAll();
        return null;
    }

    @Override
    public OrderOutputDTO createOrder(OrderInputDTO orderInputDTO) {
        OrderEntity orderEntity = new OrderEntity(orderInputDTO);
        UserEntity userEntity = this.RepositoryUser.findById(orderInputDTO.userId()).orElseThrow();

        repositoryOrder.save(orderEntity);
        return new OrderOutputDTO(orderInputDTO.status(), orderInputDTO.createAt(),userEntity);
    }
}
