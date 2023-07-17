package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * Created by gd on 7/6/2023
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
