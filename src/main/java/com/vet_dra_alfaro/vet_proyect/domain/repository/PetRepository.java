package com.vet_dra_alfaro.vet_proyect.domain.repository;

import java.util.List;
import java.util.Optional;

import com.vet_dra_alfaro.vet_proyect.domain.model.Pet;

public interface PetRepository {
     // LISTAR TODOS LOS ATRIBUTOS
     List<Pet> findAll();
     // LISTAR POR NOMBRES
     List<String> findAllNames();
     List<Pet> findByAnimalType(String animalType);
    // 🔹 3. Buscar mascota por ID (opcional para evitar null)
     Optional<Pet> findById(Long id);

     Pet save(Pet pet);
     
}
