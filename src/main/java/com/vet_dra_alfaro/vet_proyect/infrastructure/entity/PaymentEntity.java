package com.vet_dra_alfaro.vet_proyect.infrastructure.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pays")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    @Column(name = "id_order")
    private Long orderId;

    @Column(name = "payment_date")
    private LocalDateTime paymentDate;

    @Column(name = "payment_method", length = 50)
    private String paymentMethod;

    @Column(length = 20)
    private String status;

    @Column(name = "stripe_payment_intent_id", length = 100)
    private String stripePaymentIntentId;


     
}
