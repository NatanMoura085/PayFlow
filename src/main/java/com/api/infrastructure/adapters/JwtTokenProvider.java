package com.api.infrastructure.adapters;

import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTokenProvider {

    private final String secretKey = "N4t@n$3Cr3t0!JWT2024#TokenSeguro";
    private final long accessTokenValidity = 1000 * 60 * 15; // 15 min
    private final long refreshTokenValidity = 1000 * 60 * 60 * 24 * 7; // 7 dias

    public String generateAccessToken(String userId) {
        return createToken(userId, accessTokenValidity);
    }

    public String generateRefreshToken(String userId) {
        return createToken(userId, refreshTokenValidity);
    }

    private String createToken(String userId, long duration) {
        return Jwts.builder()
                .setSubject(userId)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + duration))
                .signWith(SignatureAlgorithm.HS512, secretKey)
                .compact();
    }

    public boolean isValidToken(String token) {
        try {
            Jwts.parser().setSigningKey(secretKey).build().parseClaimsJws(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            return false;
        }
    }

    public String getUserIdFromToken(String token) {
        Claims claims = Jwts.parser().setSigningKey(secretKey).build().parseClaimsJws(token).getBody();
        return claims.getSubject();
    }
}
