package com.vet_dra_alfaro.vet_proyect.infrastructure.repository.mapper;

import org.springframework.stereotype.Component;

import com.vet_dra_alfaro.vet_proyect.domain.model.Payment;
import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.PaymentEntity;


@Component
public class PaymentMapper {
     public PaymentEntity toEntity(Payment payment) {
        if (payment == null) return null;

        return PaymentEntity.builder()
                .id(payment.getId())
                .amount(payment.getAmount())
                .orderId(payment.getOrderId())
                .paymentDate(payment.getPaymentDate())
                .paymentMethod(payment.getPaymentMethod())
                .status(payment.getStatus())
                .stripePaymentIntentId(payment.getStripePaymentIntentId())
                .build();
    }

    public Payment toModel(PaymentEntity entity) {
        if (entity == null) return null;

        return Payment.builder()
                .id(entity.getId())
                .amount(entity.getAmount())
                .orderId(entity.getOrderId())
                .paymentDate(entity.getPaymentDate())
                .paymentMethod(entity.getPaymentMethod())
                .status(entity.getStatus())
                .stripePaymentIntentId(entity.getStripePaymentIntentId())
                .build();
    }
     
}
