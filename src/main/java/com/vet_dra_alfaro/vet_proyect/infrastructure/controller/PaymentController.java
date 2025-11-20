package com.vet_dra_alfaro.vet_proyect.infrastructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vet_dra_alfaro.vet_proyect.domain.model.Payment;
import com.vet_dra_alfaro.vet_proyect.domain.services.PaymentService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/register")
    public Payment register(@RequestBody Payment payment) {
        return paymentService.registerPayment(payment);
    }

    @GetMapping("/intent/{intentId}")
    public Payment getByIntentId(@PathVariable String intentId) {
        return paymentService.findByPaymentIntentId(intentId);
    }
}
