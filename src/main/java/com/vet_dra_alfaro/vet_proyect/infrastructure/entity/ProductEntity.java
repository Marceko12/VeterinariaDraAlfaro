package com.vet_dra_alfaro.vet_proyect.infrastructure.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class ProductEntity {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String barcode;
     private String brand;
     private String name;
     private Double price;
     private Integer stock;
     @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_category")
    private CategoryEntity category; // AQUÍ SE RELACIONA

    @Column(name = "photo_image")
    private String photoImage;

     
}
