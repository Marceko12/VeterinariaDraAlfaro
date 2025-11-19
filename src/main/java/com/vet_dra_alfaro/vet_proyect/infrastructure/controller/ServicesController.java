package com.vet_dra_alfaro.vet_proyect.infrastructure.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vet_dra_alfaro.vet_proyect.domain.model.Services;
import com.vet_dra_alfaro.vet_proyect.domain.repository.ServicesRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/services")
@RequiredArgsConstructor
public class ServicesController {

     private final ServicesRepository repoService;
     @GetMapping
     public List<Services> findAll(){
          return repoService.findAll();

     }

    @GetMapping("/search")
    public List<Services> findByName(@RequestParam(required = false) String name) {
        if (name == null || name.isEmpty()) {
            return repoService.findAll();
        }
        return repoService.findByName(name);
    }

     
}
