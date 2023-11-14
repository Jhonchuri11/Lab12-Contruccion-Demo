package com.tecsup.petclinic.util;

import com.tecsup.petclinic.entities.Pet;

public class VetObjectCreator {
    
    public static Pet getPet() {
        return new Pet(1,"Leo",1,1, null);
    }
}
