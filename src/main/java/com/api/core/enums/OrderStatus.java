package com.api.core.enums;

public enum OrderStatus {

    CREATED("CREATED"), PAID("PAID"), SHIPPED("SHIPPED");
    private String status;

    OrderStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
