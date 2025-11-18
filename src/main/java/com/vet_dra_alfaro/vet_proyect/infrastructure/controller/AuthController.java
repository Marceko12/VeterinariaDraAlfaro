package com.vet_dra_alfaro.vet_proyect.infrastructure.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.vet_dra_alfaro.vet_proyect.infrastructure.dto.LoginResponse;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.RoleEntity;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.UserEntity;
import com.vet_dra_alfaro.vet_proyect.infrastructure.repository.jpa.JpaRoleRepository;
import com.vet_dra_alfaro.vet_proyect.infrastructure.repository.jpa.JpaUserRepository;
import com.vet_dra_alfaro.vet_proyect.infrastructure.security.JwtUtil;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationManager authManager;
    private final JpaUserRepository userRepo;
    private final JpaRoleRepository roleRepo;
    private final PasswordEncoder encoder;
    private final JwtUtil jwtUtil;

    // ============================
    //             LOGIN
    // ============================
    @PostMapping("/login")
    public LoginResponse login(@RequestBody UserEntity loginRequest) {

        authManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                loginRequest.getEmail(),
                loginRequest.getPassword()
            )
        );

        var user = userRepo.findByEmail(loginRequest.getEmail())
                           .orElseThrow();

        // OBTIENE EL NOMBRE DEL ROL (ADMIN, CLIENTE, ETC.)
        String roleName = user.getRole().getName();

        String token = jwtUtil.generateToken(
            org.springframework.security.core.userdetails.User.builder()
                .username(user.getEmail())
                .password(user.getPassword())
                .roles(roleName)   // ← string, no la entidad
                .build()
        );

        return new LoginResponse(
            user.getId(),
            user.getName(),
            user.getEmail(),
            roleName,
            token
        );
    }

    // ============================
    //            REGISTER
    // ============================
    @PostMapping("/register")
    public String register(@RequestBody UserEntity user) {

        // Asignar rol por defecto
        RoleEntity defaultRole = roleRepo.findByName("CLIENTE")
                .orElseThrow(() -> new RuntimeException("Rol CLIENTE no encontrado."));

        user.setRole(defaultRole);
        user.setPassword(encoder.encode(user.getPassword()));
        userRepo.save(user);

        return "Usuario registrado";
    }

    // ============================
    //              ME
    // ============================
    @GetMapping("/me")
    public LoginResponse me(@RequestHeader("Authorization") String authHeader) {

        String token = authHeader.substring(7);
        String email = jwtUtil.extractUsername(token);

        var user = userRepo.findByEmail(email).orElseThrow();
        String roleName = user.getRole().getName();

        return new LoginResponse(
            user.getId(),
            user.getName(),
            user.getEmail(),
            roleName,
            token
        );
    }
}
