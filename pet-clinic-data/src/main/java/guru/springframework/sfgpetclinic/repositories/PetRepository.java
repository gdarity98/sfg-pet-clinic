package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gd on 9/28/2023
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
