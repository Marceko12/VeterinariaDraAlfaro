package com.vet_dra_alfaro.vet_proyect.domain.model;

import java.time.LocalDateTime;

public class Order {

     private Long id;
     private LocalDateTime orderTinme;
     private String status;
     private Double total;
     private Long clientId;



     public Order() {
     }



     public Order(Long id, LocalDateTime orderTinme, String status, Double total, Long clientId) {
          this.id = id;
          this.orderTinme = orderTinme;
          this.status = status;
          this.total = total;
          this.clientId = clientId;
     }




     public Long getId() {
          return id;
     }



     public void setId(Long id) {
          this.id = id;
     }



     public LocalDateTime getOrderTinme() {
          return orderTinme;
     }



     public void setOrderTinme(LocalDateTime orderTinme) {
          this.orderTinme = orderTinme;
     }



     public String getStatus() {
          return status;
     }



     public void setStatus(String status) {
          this.status = status;
     }



     public Double getTotal() {
          return total;
     }



     public void setTotal(Double total) {
          this.total = total;
     }



     public Long getClientId() {
          return clientId;
     }



     public void setClientId(Long clientId) {
          this.clientId = clientId;
     }



    

     
     

     
     
     
}
