package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gd on 9/28/2023
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
