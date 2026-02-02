package tn.esprit.ds.championnat.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSponsor;

    private String nom;
    private String pays;
    private Float budgetAnnuel;
    private Boolean bloquerContrat;

    @OneToMany(mappedBy = "sponsor")
    private Set<Contrat> contrats;

    public Sponsor() {}

    public Sponsor(String nom, String pays, Float budgetAnnuel, Boolean bloquerContrat) {
        this.nom = nom;
        this.pays = pays;
        this.budgetAnnuel = budgetAnnuel;
        this.bloquerContrat = bloquerContrat;
    }

    public Long idSponsor() {
        return idSponsor;
    }

    public void idSponsor(Long idSponsor) {
        this.idSponsor = idSponsor;
    }

    public String nom() {
        return nom;
    }

    public void nom(String nom) {
        this.nom = nom;
    }

    public String pays() {
        return pays;
    }

    public void pays(String pays) {
        this.pays = pays;
    }

    public Float budgetAnnuel() {
        return budgetAnnuel;
    }

    public void budgetAnnuel(Float budgetAnnuel) {
        this.budgetAnnuel = budgetAnnuel;
    }

    public Boolean bloquerContrat() {
        return bloquerContrat;
    }

    public void bloquerContrat(Boolean bloquerContrat) {
        this.bloquerContrat = bloquerContrat;
    }
}
