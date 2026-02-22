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
    private Double budgetAnnuel;
    private Boolean bloquerContrat;
    private Boolean archived;
    private LocalDate dateCreation;
    private LocalDate dateDerniereModification;

    @OneToMany(mappedBy = "sponsor")
    private Set<Contrat> contrats;

    public Sponsor() {}

    public Sponsor(String nom, String pays, Double budgetAnnuel, Boolean bloquerContrat,
                   Boolean archived, LocalDate dateCreation, LocalDate dateDerniereModification) {
        this.nom = nom;
        this.pays = pays;
        this.budgetAnnuel = budgetAnnuel;
        this.bloquerContrat = bloquerContrat;
        this.archived = archived;
        this.dateCreation = dateCreation;
        this.dateDerniereModification = dateDerniereModification;
    }

    // Getters / Setters standard

    public Long getIdSponsor() { return idSponsor; }
    public void setIdSponsor(Long idSponsor) { this.idSponsor = idSponsor; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPays() { return pays; }
    public void setPays(String pays) { this.pays = pays; }

    public Double getBudgetAnnuel() { return budgetAnnuel; }
    public void setBudgetAnnuel(Double budgetAnnuel) { this.budgetAnnuel = budgetAnnuel; }

    public Boolean getBloquerContrat() { return bloquerContrat; }
    public void setBloquerContrat(Boolean bloquerContrat) { this.bloquerContrat = bloquerContrat; }

    public Boolean getArchived() { return archived; }
    public void setArchived(Boolean archived) { this.archived = archived; }

    public LocalDate getDateCreation() { return dateCreation; }
    public void setDateCreation(LocalDate dateCreation) { this.dateCreation = dateCreation; }

    public LocalDate getDateDerniereModification() { return dateDerniereModification; }
    public void setDateDerniereModification(LocalDate dateDerniereModification) {
        this.dateDerniereModification = dateDerniereModification;
    }
}
