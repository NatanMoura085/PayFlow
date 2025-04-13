package com.api.core.enums;

public enum PaymentStatus {

    APPROVED("APPROVED"),PENDING("PENDING"),REJECTED("REJECTED");

    private String status;
    PaymentStatus(String status) {
        this.status =status;
    }
    public String getStatus() {
        return status;
    }
}
