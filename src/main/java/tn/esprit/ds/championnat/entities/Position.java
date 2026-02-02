package tn.esprit.ds.championnat.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPosition;

    private Integer classement;
    private Integer nbPoints;

    @ManyToOne
    private Course course;

    @ManyToOne
    private Pilote pilote;

    public Position() {}

    public Position(Integer classement, Integer nbPoints) {
        this.classement = classement;
        this.nbPoints = nbPoints;
    }

    public Long idPosition() {
        return idPosition;
    }

    public void idPosition(Long idPosition) {
        this.idPosition = idPosition;
    }

    public Integer classement() {
        return classement;
    }

    public void classement(Integer classement) {
        this.classement = classement;
    }

    public Integer nbPoints() {
        return nbPoints;
    }

    public void nbPoints(Integer nbPoints) {
        this.nbPoints = nbPoints;
    }
}
