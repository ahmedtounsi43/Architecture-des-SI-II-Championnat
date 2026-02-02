package tn.esprit.ds.championnat.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Pilote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPilote;

    private String libelleP;
    private Integer nbPointsTotal;
    private Integer classementGeneral;

    @OneToMany(mappedBy = "pilote")
    private Set<Position> positions;

    @ManyToOne
    private Equipe equipe;

    public Pilote() {}

    public Pilote(String libelleP, Integer nbPointsTotal, Integer classementGeneral) {
        this.libelleP = libelleP;
        this.nbPointsTotal = nbPointsTotal;
        this.classementGeneral = classementGeneral;
    }

    public Long idPilote() {
        return idPilote;
    }

    public void idPilote(Long idPilote) {
        this.idPilote = idPilote;
    }

    public String libelleP() {
        return libelleP;
    }

    public void libelleP(String libelleP) {
        this.libelleP = libelleP;
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
