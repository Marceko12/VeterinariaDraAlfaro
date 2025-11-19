package com.vet_dra_alfaro.vet_proyect.domain.model;

import java.time.LocalDateTime;

public class Client {
     private Long id;
     private boolean active;
     private String address;
     private LocalDateTime dateRegister;
     private String name;
     private String phoneNumber;
     private Long rol;
     
     

     public Client() {
     }


     public Client(Long id, boolean active, String address, LocalDateTime dateRegister, String name, String phoneNumber,
               Long rol) {
          this.id = id;
          this.active = active;
          this.address = address;
          this.dateRegister = dateRegister;
          this.name = name;
          this.phoneNumber = phoneNumber;
          this.rol = rol;
     }


     public Long getId() {
          return id;
     }


     public void setId(Long id) {
          this.id = id;
     }


     public boolean isActive() {
          return active;
     }


     public void setActive(boolean active) {
          this.active = active;
     }


     public String getAddress() {
          return address;
     }


     public void setAddress(String address) {
          this.address = address;
     }


     public LocalDateTime getDateRegister() {
          return dateRegister;
     }


     public void setDateRegister(LocalDateTime dateRegister) {
          this.dateRegister = dateRegister;
     }


     public String getName() {
          return name;
     }


     public void setName(String name) {
          this.name = name;
     }


     public String getPhoneNumber() {
          return phoneNumber;
     }


     public void setPhoneNumber(String phoneNumber) {
          this.phoneNumber = phoneNumber;
     }


     public Long getRol() {
          return rol;
     }


     public void setRol(Long rol) {
          this.rol = rol;
     }


     

     
     
     
}
