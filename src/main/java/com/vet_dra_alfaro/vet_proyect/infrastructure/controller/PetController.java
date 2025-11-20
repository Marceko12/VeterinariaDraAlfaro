package com.vet_dra_alfaro.vet_proyect.infrastructure.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vet_dra_alfaro.vet_proyect.domain.model.Pet;
import com.vet_dra_alfaro.vet_proyect.domain.services.PetService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/pets")
@RequiredArgsConstructor
public class PetController {

    private final PetService service;

    @GetMapping
    public ResponseEntity<List<Pet>> getPets() {
        return ResponseEntity.ok(service.listAll());
    }

    @PostMapping
    public ResponseEntity<Pet> savePet(@RequestBody Pet pet) {
        return ResponseEntity.ok(service.registerPet(pet));
    }

}