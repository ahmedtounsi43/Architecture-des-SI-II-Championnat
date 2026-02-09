package tn.esprit.ds.championnat.services;

import tn.esprit.ds.championnat.entities.Pilote;
import tn.esprit.ds.championnat.repositories.PiloteRepository;

public class PiloteService implements IPiloteService{
    PiloteRepository piloteRepository;

    @Override
    public String addPilote(Pilote p) {
        piloteRepository.save(p);
        return "Pilote added";
    }
}
