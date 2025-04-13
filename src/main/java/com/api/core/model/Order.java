package com.api.core.model;

import java.time.LocalDateTime;

public class Order {
    private Long id;
    private Long paymentId;
    private String status;
    private LocalDateTime createAt;
    private User user;
    private Payment payment;

    public Order(Long id, Long paymentId, String status, LocalDateTime createAt) {
        this.id = id;
        this.paymentId = paymentId;
        this.status = status;
        this.createAt = createAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }
}
