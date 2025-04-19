package com.api.application.controllers;

import com.api.application.dtos.authDTOS.LoginRequest;
import com.api.application.dtos.authDTOS.RefreshTokenRequest;
import com.api.application.dtos.authDTOS.TokenResponse;
import com.api.infrastructure.adapters.AuthService;
import com.api.infrastructure.adapters.JwtTokenProvider;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
public class AuthController {
    private final AuthService authService;
    private final JwtTokenProvider jwtTokenProvider;

    public AuthController(AuthService authService,JwtTokenProvider jwtTokenProvider) {
        this.authService = authService;
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @PostMapping("/login")
    public TokenResponse login(@RequestBody LoginRequest request) throws JsonProcessingException {
        TokenResponse tokenResponse = authService.login(request);
        return ResponseEntity.ok(tokenResponse).getBody();
    }

    @PostMapping("/refresh-token")
    public ResponseEntity<?> refreshToken(@RequestBody RefreshTokenRequest request) {
        String refreshToken = request.refreshToken();

        if (jwtTokenProvider.isValidToken(refreshToken)) {
            String userId = jwtTokenProvider.getUserIdFromToken(refreshToken);
            String newAccessToken = jwtTokenProvider.generateAccessToken(userId);
            return ResponseEntity.ok(new TokenResponse(newAccessToken,refreshToken));
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Refresh token inválido ou expirado");
    }
}
