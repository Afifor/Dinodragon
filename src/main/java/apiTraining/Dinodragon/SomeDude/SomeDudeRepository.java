package apiTraining.Dinodragon.SomeDude;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface SomeDudeRepository extends JpaRepository<SomeDude, Integer> {

    //Récupère la liste de toutes les personnes fan de dino
    List<SomeDude> findByDinofanIsTrue();

    List<SomeDude> findByAgeIsGreaterThan(Integer age);

    //Récupère la liste des personnes du genre donné, en les ordonnant par Age
    List<SomeDude> findByGenderIsOrderByAgeAsc(String gender);


}
