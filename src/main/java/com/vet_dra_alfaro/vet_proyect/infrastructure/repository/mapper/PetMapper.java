package com.vet_dra_alfaro.vet_proyect.infrastructure.repository.mapper;

import org.springframework.stereotype.Component;

import com.vet_dra_alfaro.vet_proyect.domain.model.Pet;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.ClientEntity;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.PetEntity;

@Component
public class PetMapper {

    // ⭐ Domain → Entity
    public PetEntity toEntity(Pet pet, ClientEntity clientEntity) {

        PetEntity entity = new PetEntity();
        entity.setNamePet(pet.getNamePet());
        entity.setAge(pet.getAge());
        entity.setSpecies(pet.getSpecies());
        entity.setClient(clientEntity); // FK correcta

        return entity;
    }

    // ⭐ Entity → Domain
    public Pet toDomain(PetEntity entity) {

        return new Pet(
                entity.getId(),
                entity.getAge(),
                entity.getNamePet(),
                entity.getSpecies(),
                entity.getClient().getId()   // FK clientId en el dominio
        );
    }
}
