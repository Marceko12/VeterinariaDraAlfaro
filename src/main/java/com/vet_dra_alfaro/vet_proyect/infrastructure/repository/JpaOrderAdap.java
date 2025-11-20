package com.vet_dra_alfaro.vet_proyect.infrastructure.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RestController;

import com.vet_dra_alfaro.vet_proyect.domain.model.Order;
import com.vet_dra_alfaro.vet_proyect.domain.repository.OrderRepository;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.OrderEntity;
import com.vet_dra_alfaro.vet_proyect.infrastructure.repository.jpa.JpaOrderRepository;
import com.vet_dra_alfaro.vet_proyect.infrastructure.repository.mapper.OrderMapper;

import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
public class JpaOrderAdap implements OrderRepository {

    private final JpaOrderRepository repo;
    private final OrderMapper mapper;

     @Override
    public Order save(Order order) {
        OrderEntity entity = mapper.toEntity(order, null);
        OrderEntity saved = repo.save(entity);
        return mapper.toDomain(saved);
    }

    @Override
    public Optional<Order> findById(Long id) {
        return repo.findById(id).map(mapper::toDomain);
    }

    @Override
    public List<Order> findAll() {
        return repo.findAll().stream().map(mapper::toDomain).collect(Collectors.toList());
    }
     
}
