package com.vet_dra_alfaro.vet_proyect.domain.services;


import com.vet_dra_alfaro.vet_proyect.domain.model.Payment;

public interface PaymentServiceDomain {

      Payment registerPayment(Payment payment);

    Payment findByPaymentIntentId(String paymentIntentId);
     
}
