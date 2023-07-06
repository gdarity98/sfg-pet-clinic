package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by gd on 7/6/2023
 */
public interface PetService {

    Pet findByID(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
