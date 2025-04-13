package com.api.core.model;

import com.api.core.enums.PaymentStatus;

public class Payment {
    private Long id;

    private Long userId;

    private Double amount;
    private PaymentStatus status;
    private User user;
    private Order order;

    public Payment(Long id, Long userId, Double amount, PaymentStatus status) {
        this.id = id;
        this.userId = userId;
        this.amount = amount;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
