package com.vet_dra_alfaro.vet_proyect.infrastructure.repository.mapper;

import com.vet_dra_alfaro.vet_proyect.domain.model.Category;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.CategoryEntity;

public class CategoryMapper {
     public static CategoryEntity toEntity(Category category) {
        if (category == null) return null;

        return new CategoryEntity(
            category.getId(),
            category.getName(),
            category.getDescription()
        );
    }

    public static Category toDomain(CategoryEntity entity) {
        if (entity == null) return null;

        return new Category(
            entity.getId(),
            entity.getName(),
            entity.getDescription()
        );
    }
     
}
