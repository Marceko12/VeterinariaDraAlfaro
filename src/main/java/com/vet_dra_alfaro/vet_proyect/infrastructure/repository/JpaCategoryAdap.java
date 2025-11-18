package com.vet_dra_alfaro.vet_proyect.infrastructure.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.vet_dra_alfaro.vet_proyect.domain.model.Category;
import com.vet_dra_alfaro.vet_proyect.domain.repository.CategoryRepository;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.CategoryEntity;
import com.vet_dra_alfaro.vet_proyect.infrastructure.repository.jpa.JpaCategoryRepository;
import com.vet_dra_alfaro.vet_proyect.infrastructure.repository.mapper.CategoryMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class JpaCategoryAdap implements CategoryRepository {

     private final JpaCategoryRepository jpaRepository;

     @Override
     public Category save(Category category) {
        CategoryEntity entity = CategoryMapper.toEntity(category);
        CategoryEntity saved = jpaRepository.save(entity);
        return CategoryMapper.toDomain(saved);
    }

    @Override
    public List<Category> findAll() {
        return jpaRepository.findAll()
                .stream()
                .map(CategoryMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> findAllNames() {
        return jpaRepository.findAllNames();
    }

    @Override
    public Category findById(Long id) {
        return jpaRepository.findById(id)
                .map(CategoryMapper::toDomain)
                .orElse(null);
    }


     
} 
