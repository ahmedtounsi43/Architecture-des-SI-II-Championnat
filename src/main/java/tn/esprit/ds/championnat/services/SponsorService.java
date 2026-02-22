package tn.esprit.ds.championnat.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ds.championnat.entities.Sponsor;
import tn.esprit.ds.championnat.repositories.SponsorRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SponsorService implements ISponsorService{

    private SponsorRepository sponsorRepository;

    @Override
    public Sponsor ajouterSponsor(Sponsor sponsor) {
        sponsor.setDateCreation(LocalDate.now());
        sponsor.setArchived(false);
        //sponsor.bloquerContrat(false);
        return sponsorRepository.save(sponsor);
    }

    @Override
    public List<Sponsor> ajouterSponsors(List<Sponsor> sponsors) {
        for (Sponsor sponsor : sponsors) {
            sponsor.setDateCreation(LocalDate.now());
            sponsor.setArchived(false);
            sponsor.setBloquerContrat(false);
        }
        return sponsorRepository.saveAll(sponsors);
    }

    @Override
    public Sponsor modifierSponsor(Sponsor sponsor) {
        sponsor.setDateDerniereModification(LocalDate.now());
        return sponsorRepository.save(sponsor);
    }

    @Override
    public void supprimerSponsor(Long idSponsor) {
        sponsorRepository.deleteById(idSponsor);
    }

    @Override
    public List<Sponsor> listSponsors() {
        return sponsorRepository.findAll();
    }

    @Override
    public Sponsor recupererSponsor(Long idSponsor) {
        return sponsorRepository.findById(idSponsor).get();
    }

    @Override
    public Boolean archiverSponsor(Long idSponsor) {
        Optional<Sponsor> sponsor = Optional.ofNullable(sponsorRepository.findById(idSponsor).orElse(null));
        sponsor.get().setArchived(true);
        sponsorRepository.save(sponsor.get());
        return sponsor.get().getArchived();
    }
}
