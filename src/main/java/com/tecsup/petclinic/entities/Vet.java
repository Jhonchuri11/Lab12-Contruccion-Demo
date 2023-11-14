package com.tecsup.petclinic.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "vets")
@Data
public class Vet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String first_name;
    private String last_name;

    public Vet() {

    }
    public Vet(int id, String first_name, String last_name) {
        super();
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Vet( String first_name, String last_name) {
        super();
        this.first_name = first_name;
        this.last_name = last_name;
    }
}
