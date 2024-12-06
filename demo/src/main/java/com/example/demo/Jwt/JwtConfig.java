package com.example.demo.Jwt;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.Key;

@Configuration
public class JwtConfig {

    @Bean
    public Key jwtSecretKey() {
        return Keys.secretKeyFor(SignatureAlgorithm.HS256); // Genera una clave segura automáticamente
    }
}
