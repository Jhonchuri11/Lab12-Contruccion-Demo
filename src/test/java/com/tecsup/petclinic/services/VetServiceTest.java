package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Vet;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.tecsup.petclinic.exception.vetNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
public class VetServiceTest {

    @Autowired
    private VetService vetService;

    /**
     *
     */
	@Test
    public void testfindById() {

        Integer ID = 1;
        String FIRST_NAME = "James";
        Vet vet = null;

        try {
            vet = this.vetService.findById(ID);
        } catch (vetNotFoundException e) {
            fail(e.getMessage());
        }
        log.info("" + vet);
        assertEquals(FIRST_NAME, vet.getFirst_name());
    }
}
