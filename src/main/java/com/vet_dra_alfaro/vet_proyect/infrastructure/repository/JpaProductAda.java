package com.vet_dra_alfaro.vet_proyect.infrastructure.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.vet_dra_alfaro.vet_proyect.domain.model.Product;
import com.vet_dra_alfaro.vet_proyect.domain.repository.ProductRepository;
import com.vet_dra_alfaro.vet_proyect.infrastructure.repository.jpa.JpaCategoryRepository;
import com.vet_dra_alfaro.vet_proyect.infrastructure.repository.jpa.JpaProductRepository;
import com.vet_dra_alfaro.vet_proyect.infrastructure.repository.mapper.ProductMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class JpaProductAda implements ProductRepository {
     
     
     private final JpaProductRepository repoProduct;
     private final JpaCategoryRepository repoCategory;

     @Override
     public List<Product> findAll() {
          return repoProduct.findAll()
          .stream()
                .map(ProductMapper::toDomain)
                .collect(Collectors.toList());

     }
}
