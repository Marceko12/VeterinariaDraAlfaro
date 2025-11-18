package com.vet_dra_alfaro.vet_proyect.infrastructure.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vet_dra_alfaro.vet_proyect.application.dto.CategoryRequest;
import com.vet_dra_alfaro.vet_proyect.domain.model.Category;
import com.vet_dra_alfaro.vet_proyect.domain.services.CategoryService;
import com.vet_dra_alfaro.vet_proyect.infrastructure.dto.CategoryResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {
     private final CategoryService service;

     @PostMapping
    public CategoryResponse create(@RequestBody CategoryRequest request) {
        Category category = new Category(
            null,
            request.getName(),
            request.getDescription()
        );

        Category saved = service.create(category);

        return new CategoryResponse(
            saved.getId(),
            saved.getName(),
            saved.getDescription()
        );
    }

    @GetMapping
    public List<CategoryResponse> listAll() {
        return service.listAll()
                .stream()
                .map(cat -> new CategoryResponse(
                    cat.getId(),
                    cat.getName(),
                    cat.getDescription()
                ))
                .collect(Collectors.toList());
    }

    @GetMapping("/names")
    public List<String> listNames() {
        return service.listNames();
    }

    @GetMapping("/{id}")
    public CategoryResponse getById(@PathVariable Long id) {
        Category category = service.find(id);

        if (category == null) {
            throw new RuntimeException("Categoría no encontrada");
        }

        return new CategoryResponse(
            category.getId(),
            category.getName(),
            category.getDescription()
        );
    }

     
}
