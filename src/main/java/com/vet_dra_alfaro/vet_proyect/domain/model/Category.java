package com.vet_dra_alfaro.vet_proyect.domain.model;

public class Category {
     private Long id;
     private String name;
     private String description;
     // CONSTRUCTORS
     public Category(Long id, String name, String description) {
          this.id = id;
          this.name = name;
          this.description = description;
     }
     public Category() {
     }

     // GETTERS AND SETTERS
     public Long getId() {
          return id;
     }
     public void setId(Long id) {
          this.id = id;
     }
     public String getName() {
          return name;
     }
     public void setName(String name) {
          this.name = name;
     }
     public String getDescription() {
          return description;
     }
     public void setDescription(String description) {
          this.description = description;
     }
     
}
