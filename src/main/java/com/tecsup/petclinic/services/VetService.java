package com.tecsup.petclinic.services;

import java.util.List;

import com.tecsup.petclinic.entities.Vet;
import com.tecsup.petclinic.exception.vetNotFoundException;
public interface VetService {
    /**
     *
     * @param vet
     * @return
     */

    Vet create(Vet vet);

    /**
     *
     * @param vet
     * @return
     */

    Vet update(Vet vet);
    /**
     *
     * @param id
     * @return
     */

    void delete(Integer id) throws vetNotFoundException;

    /**
     *
     * @param id
     * @return
     */

    Vet findById(Integer id) throws vetNotFoundException;

    /**
     *
     * @param first_name
     * @return
     */

    List<Vet> findByFirst_name(String first_name);

    /**
     *
     * @return
     */
    List<Vet> findAll();
}
