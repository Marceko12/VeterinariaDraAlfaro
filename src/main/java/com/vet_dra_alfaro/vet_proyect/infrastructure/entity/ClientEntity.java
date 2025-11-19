package com.vet_dra_alfaro.vet_proyect.infrastructure.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "clients")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean active = true;

    private String address;

    @Column(updatable = false)
    private LocalDateTime registerDate;

    private String name;

    private String phoneNumber;

    // RELACIÓN CON ROLES
    @ManyToOne
    @JoinColumn(name = "role_id")  // FK en la base de datos
    private RoleEntity role;

    @PrePersist
    public void prePersist() {
        this.registerDate = LocalDateTime.now();
        this.active = true;
        // el rol se asignará desde el servicio
    }
}

