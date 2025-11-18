package com.vet_dra_alfaro.vet_proyect.domain.model;


public class Product {
     private Long id;
     private String barcode;
     private String brand;
     private String name;
     private Double price;
     private Integer stock;
     private Long categoryId;
     private String photoImage;

     // CONSTRUCTORS
     public Product() {
     }


     public Product(Long id, String barcode, String brand, String name, Double price, Integer stock, Long categoryId,
               String photoImage) {
          this.id = id;
          this.barcode = barcode;
          this.brand = brand;
          this.name = name;
          this.price = price;
          this.stock = stock;
          this.categoryId = categoryId;
          this.photoImage = photoImage;
     }

     // GETTERS AND SETTERS
     public Long getId() {
          return id;
     }


     public void setId(Long id) {
          this.id = id;
     }


     public String getBarcode() {
          return barcode;
     }


     public void setBarcode(String barcode) {
          this.barcode = barcode;
     }


     public String getBrand() {
          return brand;
     }


     public void setBrand(String brand) {
          this.brand = brand;
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


     public Integer getStock() {
          return stock;
     }


     public void setStock(Integer stock) {
          this.stock = stock;
     }


     public Long getCategoryId() {
          return categoryId;
     }


     public void setCategoryId(Long categoryId) {
          this.categoryId = categoryId;
     }


     public String getPhotoImage() {
          return photoImage;
     }


     public void setPhotoImage(String photoImage) {
          this.photoImage = photoImage;
     }

     

     


     
     
     
}
