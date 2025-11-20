package com.vet_dra_alfaro.vet_proyect.infrastructure.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.PetEntity;

public interface JpaPetRepository extends JpaRepository<PetEntity,Long>{
         List<PetEntity> findBySpecies(String species);
     
}
