package com.vet_dra_alfaro.vet_proyect.domain.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vet_dra_alfaro.vet_proyect.domain.model.Services;
import com.vet_dra_alfaro.vet_proyect.domain.repository.ServicesRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ServicesService {
     private final ServicesRepository servicesRepository;

    /**
     * Obtiene una lista de todos los servicios disponibles.
     * * @return Una lista de objetos Services.
     */
    public List<Services> findAll() {
        // Llama al método del repositorio para obtener los datos
        return servicesRepository.findAll();
    }
     
}
