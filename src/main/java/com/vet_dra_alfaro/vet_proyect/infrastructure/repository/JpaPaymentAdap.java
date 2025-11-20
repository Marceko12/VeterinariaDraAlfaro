package com.vet_dra_alfaro.vet_proyect.infrastructure.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.vet_dra_alfaro.vet_proyect.domain.model.Payment;
import com.vet_dra_alfaro.vet_proyect.domain.repository.PaymentRepository;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.PaymentEntity;
import com.vet_dra_alfaro.vet_proyect.infrastructure.repository.jpa.JpaPaymentRepository;
import com.vet_dra_alfaro.vet_proyect.infrastructure.repository.mapper.PaymentMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class JpaPaymentAdap implements PaymentRepository {
     

     private final JpaPaymentRepository jpaRepository;
    private final PaymentMapper mapper;

     @Override
     public Payment save(Payment payment) {
           PaymentEntity entity = mapper.toEntity(payment);
          PaymentEntity saved = jpaRepository.save(entity);
          return mapper.toModel(saved);
     }

     @Override
     public Optional<Payment> findByPaymentIntentId(String paymentIntentId) {
          return jpaRepository.findByStripePaymentIntentId(paymentIntentId)
                .map(mapper::toModel);
     }


     
}
