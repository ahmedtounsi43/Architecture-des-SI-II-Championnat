package tn.esprit.ds.championnat.entities;

import jakarta.persistence.*;

@Entity
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    private Float montant;
    private String annee;
    private Boolean archived;

    @ManyToOne
    private Equipe equipe;

    @ManyToOne
    private Sponsor sponsor;

    public Contrat() {}

    public Contrat(Float montant, String annee, Boolean archived) {
        this.montant = montant;
        this.annee = annee;
        this.archived = archived;
    }

    public Long idContrat() {
        return idContrat;
    }

    public void idContrat(Long idContrat) {
        this.idContrat = idContrat;
    }

    public Float montant() {
        return montant;
    }

    public void montant(Float montant) {
        this.montant = montant;
    }

    public String annee() {
        return annee;
    }

    public void annee(String annee) {
        this.annee = annee;
    }

    public Boolean archived() {
        return archived;
    }

    public void archived(Boolean archived) {
        this.archived = archived;
    }
}
