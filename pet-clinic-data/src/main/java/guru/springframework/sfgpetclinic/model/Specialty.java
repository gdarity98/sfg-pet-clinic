package guru.springframework.sfgpetclinic.model;

/**
 * Created by gd on 8/31/2023
 */
public class Specialty extends BaseEntity{

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
