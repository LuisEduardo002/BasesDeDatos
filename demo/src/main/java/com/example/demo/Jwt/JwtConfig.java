package com.example.demo.Jwt;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;

@Configuration
public class JwtConfig {

    @Bean
    public Key jwtSecretKey() {
        String secret = "ClaveSuperSecretaDeAlMenos256BitsQueSeaFija!";
        System.out.println("Clave secreta definida en JwtConfig: " + secret);
        return Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));
    }
}
