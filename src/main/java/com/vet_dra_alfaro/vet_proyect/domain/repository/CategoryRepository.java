package com.vet_dra_alfaro.vet_proyect.domain.repository;

import java.util.List;

import com.vet_dra_alfaro.vet_proyect.domain.model.Category;

public interface CategoryRepository {

     Category save(Category category);

     List<Category> findAll();

     List<String> findAllNames();

     Category findById(Long id);

     
}
