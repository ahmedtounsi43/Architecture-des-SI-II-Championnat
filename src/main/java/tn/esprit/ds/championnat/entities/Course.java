package tn.esprit.ds.championnat.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCourse;

    private String emplacement;
    private LocalDate dateCourse;

    @ManyToMany(mappedBy = "courses")
    private Set<championnat> championnats;

    @OneToMany(mappedBy = "course")
    private Set<Position> positions;

    public Course() {}

    public Course(String emplacement, LocalDate dateCourse) {
        this.emplacement = emplacement;
        this.dateCourse = dateCourse;
    }

    public Long idCourse() {
        return idCourse;
    }

    public void idCourse(Long idCourse) {
        this.idCourse = idCourse;
    }

    public String emplacement() {
        return emplacement;
    }

    public void emplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public LocalDate dateCourse() {
        return dateCourse;
    }

    public void dateCourse(LocalDate dateCourse) {
        this.dateCourse = dateCourse;
    }
}
