package com.vet_dra_alfaro.vet_proyect.domain.repository;

import java.util.List;
import java.util.Optional;

import com.vet_dra_alfaro.vet_proyect.domain.model.Order;

public interface OrderRepository {
     Order save(Order order);

     Optional<Order> findById(Long id);

     List<Order> findAll();
     
}
