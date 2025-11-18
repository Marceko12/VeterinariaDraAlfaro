package com.vet_dra_alfaro.vet_proyect.infrastructure.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CategoryResponse {
     private Long id;
     private String name;
     private String description;
     
}
