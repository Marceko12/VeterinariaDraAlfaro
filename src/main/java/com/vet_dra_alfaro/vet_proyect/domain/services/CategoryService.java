package com.vet_dra_alfaro.vet_proyect.domain.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vet_dra_alfaro.vet_proyect.domain.model.Category;
import com.vet_dra_alfaro.vet_proyect.domain.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryService {
     private final CategoryRepository repository;

     public Category create(Category category) {
        // ejemplo de regla de negocio
        if (category.getName() == null || category.getName().isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        return repository.save(category);
    }

    public List<Category> listAll() {
        return repository.findAll();
    }

    public List<String> listNames() {
        return repository.findAllNames();
    }

    public Category find(Long id) {
        return repository.findById(id);
    }

   


     
}
