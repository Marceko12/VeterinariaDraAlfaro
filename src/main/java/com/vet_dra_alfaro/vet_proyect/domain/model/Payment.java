package com.vet_dra_alfaro.vet_proyect.domain.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {private Long id;
    private Double amount;
    private Long orderId;
    private LocalDateTime paymentDate;
    private String paymentMethod;
    private String status;
    private String stripePaymentIntentId;




    


    

    

     
}
