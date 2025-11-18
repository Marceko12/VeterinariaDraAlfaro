package com.vet_dra_alfaro.vet_proyect.infrastructure.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vet_dra_alfaro.vet_proyect.domain.model.Product;
import com.vet_dra_alfaro.vet_proyect.domain.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
     private final ProductRepository productRepo;


     @GetMapping
     public List<Product> getAll(){
          return productRepo.findAll();

     }
     
}
