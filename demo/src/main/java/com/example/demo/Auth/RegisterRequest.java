package com.example.demo.Auth;

import com.example.demo.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
  String username;
  String password;
  String firstName;
  String lastName;
  String email;
  BigDecimal saldoVirtual;
  Role role;
}
