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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getDinofan() {
        return dinofan;
    }

    public void setDinofan(Boolean dinofan) {
        this.dinofan = dinofan;
    }

    public Boolean getDracofan() {
        return dracofan;
    }

    public void setDracofan(Boolean dracofan) {
        this.dracofan = dracofan;
    }
}
