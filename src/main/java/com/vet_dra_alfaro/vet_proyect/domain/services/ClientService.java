package com.vet_dra_alfaro.vet_proyect.domain.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vet_dra_alfaro.vet_proyect.domain.model.Client;
import com.vet_dra_alfaro.vet_proyect.domain.repository.ClientRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClientService {

     private final ClientRepository clientRepository;

    // Obtener todos los clientes
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    // Guardar cliente
    public Client createClient(Client client) {

        // Establecer valores por defecto
        client.setActive(true);

        // Si no envían el rol, por defecto asignamos 1 (CLIENTE)
        if (client.getRol() == null) {
            client.setRol(1L);
        }

        return clientRepository.save(client);
    }
     
}
