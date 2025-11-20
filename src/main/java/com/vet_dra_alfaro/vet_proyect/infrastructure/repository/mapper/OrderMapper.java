package com.vet_dra_alfaro.vet_proyect.infrastructure.repository.mapper;

import org.springframework.stereotype.Component;

import com.vet_dra_alfaro.vet_proyect.domain.model.Order;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.ClientEntity;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.OrderEntity;

@Component
public class OrderMapper {

     public OrderEntity toEntity(Order order, ClientEntity client) {
    OrderEntity entity = new OrderEntity();
    entity.setId(order.getId());
    entity.setStatus(order.getStatus());
    entity.setTotal(order.getTotal());
    entity.setClient(client);
    return entity;
}

public Order toDomain(OrderEntity entity) {
    return new Order(
        entity.getId(),
        entity.getOrderTime(),
        entity.getStatus(),
        entity.getTotal(),
        entity.getClient().getId()
    );
}
     
}
