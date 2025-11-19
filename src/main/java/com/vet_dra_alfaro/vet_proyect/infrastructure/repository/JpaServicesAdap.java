package com.vet_dra_alfaro.vet_proyect.infrastructure.repository;




import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.vet_dra_alfaro.vet_proyect.domain.model.Services;
import com.vet_dra_alfaro.vet_proyect.domain.repository.ServicesRepository;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.ServicesEntity;
import com.vet_dra_alfaro.vet_proyect.infrastructure.repository.jpa.JpaServicesRepository;
import com.vet_dra_alfaro.vet_proyect.infrastructure.repository.mapper.ServicesMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class JpaServicesAdap implements ServicesRepository {
     
     private final JpaServicesRepository repo;
     private final ServicesMapper mapper; // <--- Inject the Mapper

     @Override
     public List<Services> findAll() {
          
         // 1. Get the list of Entities from the database
         List<ServicesEntity> entities = repo.findAll();
         
         // 2. Map (Convert) the List<ServicesEntity> to List<Services>
         return entities.stream()
                        .map(mapper::toDomain) // Assumes a method 'toDomain(ServicesEntity)' exists
                        .collect(Collectors.toList());
     }

     @Override
     public List<Services> findByName(String name) {
          List<ServicesEntity> entities = repo.findByName(name);
         
         return entities.stream()
                        .map(mapper::toDomain)
                        .collect(Collectors.toList());
     }
}

    
     

          

     

