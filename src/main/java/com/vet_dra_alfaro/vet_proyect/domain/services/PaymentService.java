package com.vet_dra_alfaro.vet_proyect.domain.services;

import org.springframework.stereotype.Service;

import com.vet_dra_alfaro.vet_proyect.domain.model.Payment;
import com.vet_dra_alfaro.vet_proyect.domain.repository.PaymentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentService implements PaymentServiceDomain {
     
     
     
    private final PaymentRepository repository;

    @Override
    public Payment registerPayment(Payment payment) {
        return repository.save(payment);
    }

    @Override
    public Payment findByPaymentIntentId(String paymentIntentId) {
        return repository.findByPaymentIntentId(paymentIntentId)
                .orElse(null);
    }
     
}
