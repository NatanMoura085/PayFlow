package com.api.application.dtos.authDTOS;

public record TokenResponse(String accessToken) {
    @Override
    public String accessToken() {
        return accessToken;
    }
}
