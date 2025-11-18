package com.vet_dra_alfaro.vet_proyect.infrastructure.repository.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.UserEntity;

public interface JpaUserRepository extends JpaRepository<UserEntity, Long> {
    
    Optional<UserEntity> findByEmail(String email);
}
