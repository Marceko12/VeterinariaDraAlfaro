package com.vet_dra_alfaro.vet_proyect.infrastructure.repository.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.PaymentEntity;

public interface JpaPaymentRepository extends JpaRepository<PaymentEntity, Long> {
     Optional<PaymentEntity> findByStripePaymentIntentId(String paymentIntentId);
     
}
