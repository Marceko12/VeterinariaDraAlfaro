package com.vet_dra_alfaro.vet_proyect.infrastructure.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.vet_dra_alfaro.vet_proyect.domain.model.Pet;
import com.vet_dra_alfaro.vet_proyect.domain.repository.PetRepository;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.ClientEntity;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.PetEntity;
import com.vet_dra_alfaro.vet_proyect.infrastructure.repository.jpa.JpaClientRepository;
import com.vet_dra_alfaro.vet_proyect.infrastructure.repository.jpa.JpaPetRepository;
import com.vet_dra_alfaro.vet_proyect.infrastructure.repository.mapper.PetMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class JpaPetAdap implements PetRepository {
    
    private final JpaPetRepository petRepo;
    private final JpaClientRepository clientRepo;
    private final PetMapper mapper;


    
    @Override
    public List<Pet> findAll() {
        return petRepo.findAll()
                    .stream()
                    .map(mapper::toDomain)
                    .collect(Collectors.toList());
    }

    @Override
    public List<String> findAllNames() {
        return petRepo.findAll()
                    .stream()
                    .map(p -> p.getNamePet())
                    .collect(Collectors.toList());
    }

    @Override
    public List<Pet> findByAnimalType(String animalType) {
        return petRepo.findBySpecies(animalType)
                    .stream()
                    .map(mapper::toDomain)
                    .collect(Collectors.toList());
    }

    @Override
    public Optional<Pet> findById(Long id) {
        return petRepo.findById(id)
                    .map(mapper::toDomain);
    }

    @Override
    public Pet save(Pet pet) {
    // 1️⃣ Buscar el cliente dueño de la mascota
    ClientEntity client = clientRepo.findById(pet.getClientId())
            .orElseThrow(() -> new RuntimeException(
                    "Cliente no encontrado con ID: " + pet.getClientId()));

    // 2️⃣ Mapear dominio → entidad
    PetEntity entity = mapper.toEntity(pet, client);

    // 3️⃣ Guardar en BD
    PetEntity saved = petRepo.save(entity);

    // 4️⃣ Convertir entidad → dominio
    return mapper.toDomain(saved);
    }
}
