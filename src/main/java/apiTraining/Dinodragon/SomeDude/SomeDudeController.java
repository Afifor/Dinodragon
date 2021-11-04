package apiTraining.Dinodragon.SomeDude;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.*;

@RestController
public class SomeDudeController {
    private final SomeDudeService someDudeService;

    public SomeDudeController(SomeDudeService someDudeService) {
        this.someDudeService = someDudeService;
    }

    // Endpoint qui affiche les personnes majeures présentes dans la bdd
    @GetMapping(value = "/majeurs")
    public List<String> personnesMajeures() {
        return this.someDudeService.findUsersAbove18().stream().map(someDude -> someDude.getName()).collect(Collectors.toList());
    }
}
