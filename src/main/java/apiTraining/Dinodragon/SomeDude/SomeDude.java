package apiTraining.Dinodragon.SomeDude;

import javax.persistence.*;

@Entity
public class SomeDude {
    @Id
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private Boolean dinofan;
    private Boolean dracofan;
}
