package com.vet_dra_alfaro.vet_proyect.domain.repository;

import java.util.List;

import com.vet_dra_alfaro.vet_proyect.domain.model.Client;

public interface ClientRepository {
     // LISTAR LOS CLIENTE 
     List<Client> findAll();
     // GUARDAR CLIENTE
     Client save(Client client);

     

     
}
