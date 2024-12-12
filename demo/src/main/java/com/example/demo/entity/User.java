package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user", uniqueConstraints = {@UniqueConstraint(columnNames = {"username"})})
public class User implements UserDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
@Column(nullable = false)

    String username;

    String password;

    @Column(nullable = false, length = 255)
    String firstName;

    @Column(nullable = false, length = 255)
    String lastName;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(name = "saldo_virtual", precision = 10, scale = 2, nullable = false)
    private BigDecimal saldoVirtual = BigDecimal.ZERO;

    @Column(nullable = false)
    Role role;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }
}
