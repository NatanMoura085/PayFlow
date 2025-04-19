package com.api.application.dtos.authDTOS;

public record TokenResponse(String accessToken,String refreshToken) {
    @Override
    public String accessToken() {
        return accessToken;
    }

    @Override
    public String refreshToken() {
        return refreshToken;
    }
}
