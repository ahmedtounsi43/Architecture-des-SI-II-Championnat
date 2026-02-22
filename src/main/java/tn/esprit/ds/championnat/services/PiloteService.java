package tn.esprit.ds.championnat.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ds.championnat.entities.Pilote;
import tn.esprit.ds.championnat.repositories.PiloteRepository;

@Service
@AllArgsConstructor
public class PiloteService implements IPiloteService{
    PiloteRepository piloteRepository;

    @Override
    public Pilote addPilote(Pilote p) {
        piloteRepository.save(p);
        return p;
    }
}
