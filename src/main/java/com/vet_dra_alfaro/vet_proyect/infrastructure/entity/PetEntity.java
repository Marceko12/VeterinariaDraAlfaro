package com.vet_dra_alfaro.vet_proyect.infrastructure.entity;

import com.vet_dra_alfaro.vet_proyect.domain.model.Client;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pets")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class PetEntity {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     @Column(name = "age")
     private Integer age;
     @Column(name = "name_pet")
     private String namePet;
     @Column(name = "species")
     private String species;
      @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)  // FK correcta
    private ClientEntity client;
     

     
     
     

     
}
