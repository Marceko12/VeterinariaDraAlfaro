package com.vet_dra_alfaro.vet_proyect.domain.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.vet_dra_alfaro.vet_proyect.domain.model.Order;
import com.vet_dra_alfaro.vet_proyect.domain.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
     private final OrderRepository repo;

    
     public Order createOrder(Order order) {
        return repo.save(order);
    }

    public Optional<Order> getById(Long id) {
        return repo.findById(id);
    }

    public List<Order> getAll() {
        return repo.findAll();
    }

     
}
