package com.vet_dra_alfaro.vet_proyect.infrastructure.repository.mapper;

import org.springframework.stereotype.Component;

import com.vet_dra_alfaro.vet_proyect.domain.model.Client;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.ClientEntity;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.RoleEntity;

@Component
public class ClientMapper {

    // ⭐ Domain → Entity
    public ClientEntity toEntity(Client client, RoleEntity role) {

        ClientEntity entity = new ClientEntity();
        entity.setName(client.getName());
        entity.setAddress(client.getAddress());
        entity.setPhoneNumber(client.getPhoneNumber());
        entity.setActive(client.isActive());
        entity.setRole(role);
        // registerDate se asigna solo con @PrePersist

        return entity;
    }

    // ⭐ Entity → Domain
    public Client toDomain(ClientEntity entity) {

        return new Client(
                entity.getId(),
                entity.isActive(),
                entity.getAddress(),
                entity.getRegisterDate(),   // LocalDateTime
                entity.getName(),
                entity.getPhoneNumber(),
                entity.getRole().getId()    // FK rol
        );
    }
}
