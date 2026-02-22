package tn.esprit.ds.championnat.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.championnat.entities.Sponsor;
import tn.esprit.ds.championnat.services.ISponsorService;
import tn.esprit.ds.championnat.services.SponsorService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/sponsor")
public class SponsorRestController {

    private ISponsorService sponsorService;

    @GetMapping("/retrieve-all-sponsors")
    public List<Sponsor> getSponsors() {
        return sponsorService.listSponsors();
    }

    @GetMapping("/retrieve-sponsor/{idSponsor}")
    public Sponsor retrieveSponsor(@PathVariable("idSponsor") Long idSponsor) {
        return sponsorService.recupererSponsor(idSponsor);
    }


    @PostMapping("/add-sponsor")
    public Sponsor addSponsor(@RequestBody Sponsor Sponsor) {
        return sponsorService.ajouterSponsor(Sponsor);
    }

    @DeleteMapping("/remove-sponsor/{idSponsor}")
    public void removeSponsor(@PathVariable("idSponsor") Long idSponsor) {
        sponsorService.supprimerSponsor(idSponsor);
    }

    @PutMapping("/update-sponsor")
    public Sponsor updateSponsor(@RequestBody Sponsor p) {
        return sponsorService.modifierSponsor(p);
    }
}

