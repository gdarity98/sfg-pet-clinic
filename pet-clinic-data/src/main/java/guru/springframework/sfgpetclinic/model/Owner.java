package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by gd on 6/26/2023
 */
public class Owner extends Person{

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
