package com.vet_dra_alfaro.vet_proyect.domain.model;

public class Services {

     private Long id;
     private String Description;
     private String name;
     private Double price;



     public Services() {
     }

     public Services(Long id, String description, String name, Double price) {
          this.id = id;
          Description = description;
          this.name = name;
          this.price = price;
     }

     public Long getId() {
          return id;
     }



     public void setId(Long id) {
          this.id = id;
     }



     public String getDescription() {
          return Description;
     }



     public void setDescription(String description) {
          Description = description;
     }



     public String getName() {
          return name;
     }



     public void setName(String name) {
          this.name = name;
     }



     public Double getPrice() {
          return price;
     }



     public void setPrice(Double price) {
          this.price = price;
     }

     

     
     
}
