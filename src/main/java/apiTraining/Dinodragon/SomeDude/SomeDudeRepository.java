package apiTraining.Dinodragon.SomeDude;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface SomeDudeRepository extends JpaRepository<SomeDude, Integer> {
}
