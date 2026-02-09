package tn.esprit.ds.championnat.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
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
    private Boolean archived;
    private LocalDate dateCreation;
    private LocalDate dateDerniereModification;

    @OneToMany(mappedBy = "sponsor")
    private Set<Contrat> contrats;

    public Sponsor() {

    }

    public Sponsor(String nom, String pays, Float budgetAnnuel, Boolean bloquerContrat, Boolean archived, LocalDate dateCreation, LocalDate dateDerniereModification) {
        this.nom = nom;
        this.pays = pays;
        this.budgetAnnuel = budgetAnnuel;
        this.bloquerContrat = bloquerContrat;
        this.archived = archived;
        this.dateCreation = dateCreation;
        this.dateDerniereModification = dateDerniereModification;
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

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public LocalDate getDateDerniereModification() {
        return dateDerniereModification;
    }

    public void setDateDerniereModification(LocalDate dateDerniereModification) {
        this.dateDerniereModification = dateDerniereModification;
    }
}
