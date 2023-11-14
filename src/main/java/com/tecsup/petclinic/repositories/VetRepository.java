package com.tecsup.petclinic.repositories;

import com.tecsup.petclinic.entities.Vet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VetRepository extends CrudRepository<Vet, Integer> {

    // Buscando vets por el primer nombre

    List<Vet> findByFirst_name(String first_name);

    // Listar los vets
    @Override
    List<Vet> findAll();
}
