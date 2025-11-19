package com.vet_dra_alfaro.vet_proyect.domain.repository;

import java.util.List;

import com.vet_dra_alfaro.vet_proyect.domain.model.Services;

public interface ServicesRepository {
     List<Services> findAll();
     List<Services> findByName(String name);

}
