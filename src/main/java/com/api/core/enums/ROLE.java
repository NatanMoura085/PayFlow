package com.api.core.enums;

public enum ROLE {
        ROLE_ADMIN("ADMIN"), ROLE_USER("USER");

    private String status;

    ROLE(String status) {
        this.status = status;
    }
}
