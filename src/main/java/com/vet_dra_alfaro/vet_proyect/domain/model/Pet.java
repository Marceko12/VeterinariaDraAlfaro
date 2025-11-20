package com.vet_dra_alfaro.vet_proyect.domain.model;

import jakarta.persistence.Column;

public class Pet {

     private Long id;
     private Integer age;
     private String namePet;
     private String species;
     private Long clientId;
     // CONSTRUCTOR
     
     public Pet() {
     }

     public Pet(Long id, Integer age, String namePet, String species, Long clientId) {
          this.id = id;
          this.age = age;
          this.namePet = namePet;
          this.species = species;
          this.clientId = clientId;
     }

     // FETTERS AND SETTERS
     public Long getId() {
          return id;
     }
     public void setId(Long id) {
          this.id = id;
     }
     public Integer getAge() {
          return age;
     }
     public void setAge(Integer age) {
          this.age = age;
     }
     
     public String getSpecies() {
          return species;
     }
     public void setSpecies(String species) {
          this.species = species;
     }
     public Long getClientId() {
          return clientId;
     }
     public void setClientId(Long clientId) {
          this.clientId = clientId;
     }

     public String getNamePet() {
          return namePet;
     }

     public void setNamePet(String namePet) {
          this.namePet = namePet;
     }
     
}



