package com.vet_dra_alfaro.vet_proyect.infrastructure.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.vet_dra_alfaro.vet_proyect.domain.model.Client;
import com.vet_dra_alfaro.vet_proyect.domain.repository.ClientRepository;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.ClientEntity;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.RoleEntity;
import com.vet_dra_alfaro.vet_proyect.infrastructure.repository.jpa.JpaClientRepository;
import com.vet_dra_alfaro.vet_proyect.infrastructure.repository.jpa.JpaRoleRepository;
import com.vet_dra_alfaro.vet_proyect.infrastructure.repository.mapper.ClientMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class JpaClientAdap implements ClientRepository {

    private final JpaClientRepository repo;
    private final JpaRoleRepository roleRepo;
    private final ClientMapper mapper;

    @Override
    public List<Client> findAll() {
        return repo.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Client save(Client client) {

        // Obtener rol
        RoleEntity role = roleRepo.findById(client.getRol())
                .orElseThrow(() -> new RuntimeException("Rol no encontrado: " + client.getRol()));

        // Convertir dominio → entity
        ClientEntity entity = mapper.toEntity(client, role);

        // Guardar
        ClientEntity saved = repo.save(entity);

        // Entity → dominio
        return mapper.toDomain(saved);
    }
}
