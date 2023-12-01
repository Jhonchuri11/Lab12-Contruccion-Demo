package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Vet;
import com.tecsup.petclinic.exception.vetNotFoundException;
import com.tecsup.petclinic.repositories.VetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class VetServiceImpl implements VetService {

    VetRepository vetRepository;

    public VetServiceImpl (VetRepository vetRepository) {this. vetRepository = vetRepository;}

    /**
     *
     * @param vet
     * @return
     */

    @Override
    public Vet create(Vet vet) {
        return vetRepository.save(vet);
    }

    /**
     *
     * @param vet
     * @return
     */

    @Override
    public Vet update(Vet vet) {
        return vetRepository.save(vet);
    }
    /**
     *
     * @param id
     * @throws vetNotFoundException
     */

    @Override
    public void delete(Integer id) throws vetNotFoundException {

        Vet vet = findById(id);
        vetRepository.delete(vet);

    }

    /**
     *
     * @param id
     * @return
     */

    @Override
    public Vet findById(Integer id) throws vetNotFoundException {
        Optional<Vet> vet = vetRepository.findById(id);

        if (!vet.isPresent())
            throw  new vetNotFoundException("Record not found..!");
        return vet.get();
    }

    /**
     *
     * @param first_name
     * @return
     */

    @Override
    public List<Vet> findByFirst_name(String first_name) {

        List<Vet> vets = vetRepository.findByFirst_name(first_name);
        vets.stream().forEach(vet -> log.info("" + vet));
        return vets;
    }
    /**
     *
     * @return
     */
    @Override
    public List<Vet> findAll() {

        return vetRepository.findAll();
    }
}
