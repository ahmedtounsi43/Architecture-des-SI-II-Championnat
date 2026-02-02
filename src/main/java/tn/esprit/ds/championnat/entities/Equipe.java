package tn.esprit.ds.championnat.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipe;

    private String libelle;
    private Integer nbPointsTotal;
    private Integer classementGeneral;

    @OneToMany(mappedBy = "equipe")
    private Set<Pilote> pilotes;

    @OneToMany(mappedBy = "equipe")
    private Set<Contrat> contrats;

    public Equipe() {}

    public Equipe(String libelle, Integer nbPointsTotal, Integer classementGeneral) {
        this.libelle = libelle;
        this.nbPointsTotal = nbPointsTotal;
        this.classementGeneral = classementGeneral;
    }

    public Long idEquipe() {
        return idEquipe;
    }

    public void idEquipe(Long idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String libelle() {
        return libelle;
    }

    public void libelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer nbPointsTotal() {
        return nbPointsTotal;
    }

    public void nbPointsTotal(Integer nbPointsTotal) {
        this.nbPointsTotal = nbPointsTotal;
    }

    public Integer classementGeneral() {
        return classementGeneral;
    }

    public void classementGeneral(Integer classementGeneral) {
        this.classementGeneral = classementGeneral;
    }
}
