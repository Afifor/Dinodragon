package apiTraining.Dinodragon.SomeDude;

import org.springframework.stereotype.*;

import java.util.*;

@Service
public class SomeDudeService {
private final SomeDudeRepository someDudeRepository;

    public SomeDudeService(SomeDudeRepository someDudeRepository) {
        this.someDudeRepository = someDudeRepository;
    }

    public List<SomeDude> findUsersAbove18() {
        return someDudeRepository.findByAgeIsGreaterThan(18);
    }
}
