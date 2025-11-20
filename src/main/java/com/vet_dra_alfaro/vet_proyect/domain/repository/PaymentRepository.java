package com.vet_dra_alfaro.vet_proyect.domain.repository;

import java.util.Optional;

import com.vet_dra_alfaro.vet_proyect.domain.model.Payment;

public interface PaymentRepository {
     Payment save(Payment payment);

     Optional<Payment> findByPaymentIntentId(String paymentIntentId);

     
}
