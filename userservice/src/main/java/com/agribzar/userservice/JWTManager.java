package com.agribzar.userservice;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.SecretKey;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

@Service
public class JWTManager {

    private static final SecretKey JWT_SECRET_KEY = Keys.hmacShaKeyFor(
            "MySuperSecretKeyForJWTAuthentication2025!".getBytes());

    public String generateToken(String username) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("username", username);

        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 86400000)) // 1 day expiry
                .signWith(JWT_SECRET_KEY, SignatureAlgorithm.HS256)
                .compact();
    }

    public Map<String, String> validateToken(String token) {
        Map<String, String> response = new HashMap<>();
        try {
            Claims claims = Jwts.parserBuilder()
                    .setSigningKey(JWT_SECRET_KEY)
                    .build()
                    .parseClaimsJws(token)
                    .getBody();

            Date expiration = claims.getExpiration();
            if (expiration == null || expiration.before(new Date())) {
                response.put("code", "404");
                response.put("message", "Token expired");
                return response;
            }

            response.put("code", "200");
            response.put("message", claims.get("username", String.class));
            return response;
        } catch (Exception e) {
            response.put("code", "404");
            response.put("message", "Invalid Token");
            return response;
        }
    }
}