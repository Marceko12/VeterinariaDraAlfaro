package com.vet_dra_alfaro.vet_proyect.infrastructure.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.ProductEntity;

public interface JpaProductRepository extends JpaRepository<ProductEntity, Long>{

}
