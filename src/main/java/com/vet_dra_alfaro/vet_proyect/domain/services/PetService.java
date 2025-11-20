package com.vet_dra_alfaro.vet_proyect.domain.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vet_dra_alfaro.vet_proyect.domain.model.Pet;
import com.vet_dra_alfaro.vet_proyect.domain.repository.PetRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PetService {
     private final PetRepository petRepository;

    public List<Pet> listAll() {
        return petRepository.findAll();
    }

    public Pet registerPet(Pet pet) {
        return petRepository.save(pet);
    }
     
}
