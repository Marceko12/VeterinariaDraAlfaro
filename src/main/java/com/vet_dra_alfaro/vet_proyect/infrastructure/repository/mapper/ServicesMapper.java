package com.vet_dra_alfaro.vet_proyect.infrastructure.repository.mapper;

import org.springframework.stereotype.Component;

import com.vet_dra_alfaro.vet_proyect.application.dto.ServicesRequest;
import com.vet_dra_alfaro.vet_proyect.domain.model.Services;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.ServicesEntity;

@Component
public class ServicesMapper {
     // ---------- ENTITY → DOMAIN ----------
    public Services toDomain(ServicesEntity entity) {
        if (entity == null) return null;

        return new Services(
            entity.getId(),
            entity.getName(),
            entity.getDescription(),
            entity.getPrice()
        );
    }

    // ---------- DOMAIN → ENTITY ----------
    public ServicesEntity toEntity(Services domain) {
        if (domain == null) return null;

        ServicesEntity entity = new ServicesEntity();
        entity.setId(domain.getId());
        entity.setName(domain.getName());
        entity.setDescription(domain.getDescription());
        entity.setPrice(domain.getPrice());

        return entity;
    }

    // ---------- DOMAIN → DTO ----------
    public ServicesRequest toDto(Services domain) {
        if (domain == null) return null;

        ServicesRequest dto = new ServicesRequest();
        dto.setId(domain.getId());
        dto.setName(domain.getName());
        dto.setDescription(domain.getDescription());
        dto.setPrice(domain.getPrice());

        return dto;
    }

    // ---------- DTO → DOMAIN ----------
    public Services toDomainFromDto(ServicesRequest dto) {
        if (dto == null) return null;

        return new Services(
            dto.getId(),
            dto.getName(),
            dto.getDescription(),
            dto.getPrice()
        );
    }
     
}
