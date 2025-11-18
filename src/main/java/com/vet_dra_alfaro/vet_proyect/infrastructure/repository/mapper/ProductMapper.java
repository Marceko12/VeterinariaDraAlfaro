package com.vet_dra_alfaro.vet_proyect.infrastructure.repository.mapper;

import com.vet_dra_alfaro.vet_proyect.domain.model.Product;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.CategoryEntity;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.ProductEntity;

public class ProductMapper {
     public static Product toDomain(ProductEntity entity){
          return new Product(
               entity.getId(),
               entity.getBarcode(),
               entity.getBrand(),
               entity.getName(),
               entity.getPrice(),
               entity.getStock(),
               entity.getCategory().getId(),
               entity.getPhotoImage()
          );
     }

     public static ProductEntity toEntity(Product domain, CategoryEntity category) {
        ProductEntity entity = new ProductEntity();
        entity.setId(domain.getId());
        entity.setBarcode(domain.getBarcode());
        entity.setBrand(domain.getBrand());
        entity.setName(domain.getName());
        entity.setPrice(domain.getPrice());
        entity.setStock(domain.getStock());
        entity.setCategory(category); // Se asigna la relación
        entity.setPhotoImage(domain.getPhotoImage());
        return entity;
    }
     
}
