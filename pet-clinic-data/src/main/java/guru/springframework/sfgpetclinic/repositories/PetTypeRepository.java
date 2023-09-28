package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gd on 9/28/2023
 */
public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
