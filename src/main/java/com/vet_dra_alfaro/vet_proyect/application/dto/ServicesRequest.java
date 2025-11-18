package com.vet_dra_alfaro.vet_proyect.application.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
public class ServicesRequest {
     private Long id;
     private String name;
     private String description;
     private Double price;
     
     
}
