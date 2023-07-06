package guru.springframework.sfgpetclinic.model;

/**
 * Created by gd on 6/26/2023
 */
public class PetType extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
