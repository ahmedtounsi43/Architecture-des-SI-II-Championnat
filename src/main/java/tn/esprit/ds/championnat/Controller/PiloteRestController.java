package tn.esprit.ds.championnat.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.championnat.entities.Pilote;
import tn.esprit.ds.championnat.services.IPiloteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/pilote")
public class PiloteRestController {
    IPiloteService piloteService;

    // http://localhost:8089/championnat/pilote/add-pilote
    @PostMapping("/add-pilote")
    public Pilote addPilote(@RequestBody Pilote p) {
        return piloteService.addPilote(p);
    }
}

