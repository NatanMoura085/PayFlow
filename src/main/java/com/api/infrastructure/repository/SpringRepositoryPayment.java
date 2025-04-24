package com.api.infrastructure.repository;

import com.api.infrastructure.entities.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringRepositoryPayment extends JpaRepository<PaymentEntity,Long> {
}
