package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by gd on 7/6/2023
 */
public interface VetService {

    Vet findByID(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
