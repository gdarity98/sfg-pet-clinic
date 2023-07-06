package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by gd on 7/6/2023
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findByID(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
