package com.vet_dra_alfaro.vet_proyect.domain.model;

public class Pet {

     private Long id;
     private Integer age;
     private String name_pet;
     private String species;
     private Long clientId;


     

     // CONSTRUCTOR
     
     public Pet() {
     }


     public Pet(Long id, Integer age, String name_pet, String species, Long clientId) {
          this.id = id;
          this.age = age;
          this.name_pet = name_pet;
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
     public String getName_pet() {
          return name_pet;
     }
     public void setName_pet(String name_pet) {
          this.name_pet = name_pet;
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
     
}



