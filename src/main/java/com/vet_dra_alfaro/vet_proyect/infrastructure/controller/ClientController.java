package com.vet_dra_alfaro.vet_proyect.infrastructure.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vet_dra_alfaro.vet_proyect.domain.model.Client;
import com.vet_dra_alfaro.vet_proyect.domain.services.ClientService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/clients")
@RequiredArgsConstructor
public class ClientController {

     private final ClientService clientService;

    // Obtener todos los clientes
    @GetMapping
    public ResponseEntity<List<Client>> findAll() {
        return ResponseEntity.ok(clientService.getAllClients());
    }

    // Crear cliente
    @PostMapping
    public ResponseEntity<Client> create(@RequestBody Client client) {
        Client saved = clientService.createClient(client);
        return ResponseEntity.ok(saved);
    }
     
}
