package com.vet_dra_alfaro.vet_proyect.infrastructure.repository.mapper;

import com.vet_dra_alfaro.vet_proyect.application.dto.ServicesRequest;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.ServicesEntity;

public class ServicesMapper {
     public ServicesRequest toDto(ServicesEntity entity) {
        if (entity == null) return null;

        ServicesRequest dto = new ServicesRequest();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        dto.setPrice(entity.getPrice());

        return dto;
    }

    public ServicesEntity toEntity(ServicesRequest dto) {
        if (dto == null) return null;

        ServicesEntity entity = new ServicesEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setPrice(dto.getPrice());

        return entity;
    }
     
}
