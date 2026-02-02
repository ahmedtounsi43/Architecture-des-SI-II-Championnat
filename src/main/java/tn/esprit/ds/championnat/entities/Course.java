package tn.esprit.ds.championnat.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCourse;

    private String emplacement;
    private LocalDate dateCourse;

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
