package com.vet_dra_alfaro.vet_proyect.domain.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.testng.annotations.Optional;

import com.vet_dra_alfaro.vet_proyect.domain.model.Product;
import com.vet_dra_alfaro.vet_proyect.domain.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
      private final ProductRepository repository;

    // LISTAR TODOS
    public List<Product> findAll() {
        return repository.findAll();
    }

}
