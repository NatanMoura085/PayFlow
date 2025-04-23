package com.api.infrastructure.repository;

import com.api.infrastructure.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringRepositoryOrder extends JpaRepository<OrderEntity,Long> {
}
