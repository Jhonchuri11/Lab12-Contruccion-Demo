package com.tecsup.petclinic.services;

import java.util.List;

import com.tecsup.petclinic.entities.Vet;
import com.tecsup.petclinic.exception.vetNotFoundException;
public interface VetService {

    Vet create(Vet vet);

    Vet update(Vet vet);

    void delete(Integer id) throws vetNotFoundException;

    Vet findById(Integer id) throws vetNotFoundException;


    Vet findByFirst_name(String first_name);

    List<Vet> findAll();
}
