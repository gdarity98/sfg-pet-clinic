package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by gd on 7/17/2023
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findByID(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
