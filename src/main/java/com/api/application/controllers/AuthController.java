package com.api.application.controllers;

import com.api.application.dtos.authDTOS.LoginRequest;
import com.api.application.dtos.authDTOS.RefreshTokenRequest;
import com.api.application.dtos.authDTOS.TokenResponse;
import com.api.infrastructure.adapters.AuthService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
public class AuthController {
    private final AuthService authService;


    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public TokenResponse login(@RequestBody LoginRequest request) throws JsonProcessingException {
        TokenResponse tokenResponse = authService.login(request);
        return ResponseEntity.ok(tokenResponse).getBody();
    }

    @PostMapping("/refresh-token")
    public ResponseEntity<TokenResponse> refreshToken(@RequestBody RefreshTokenRequest request) throws JsonProcessingException {
        TokenResponse tokenResponse = authService.refreshToken(request.refreshToken());
        return ResponseEntity.ok(tokenResponse);
    }
}
