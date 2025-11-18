package com.vet_dra_alfaro.vet_proyect.domain.repository;

import java.util.List;

import com.vet_dra_alfaro.vet_proyect.domain.model.Product;

public interface ProductRepository {
     List<Product> findAll();
     
}
