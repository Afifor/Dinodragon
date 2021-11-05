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
    // http://localhost:8080/dinodragon/majeurs
    @GetMapping(value = "/majeurs")
    public List<String> personnesMajeures() {
        return this.someDudeService.findUsersAbove18().stream().map(someDude -> someDude.getName()).collect(Collectors.toList());
    }

    // Endpoint qui affiche tous les hommes ou toutes les femmes dans la BDD selon le genre spécifié
    // http://localhost:8080/dinodragon/all?gender=
    @GetMapping(value = "/all")
    public List<SomeDude> femmesOuHommes(@RequestParam String gender) {
        return this.someDudeService.findAllUserByGenre(gender);
    }
}
