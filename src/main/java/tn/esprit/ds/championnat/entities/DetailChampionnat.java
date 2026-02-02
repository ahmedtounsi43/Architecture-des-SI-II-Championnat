package tn.esprit.ds.championnat.entities;

import jakarta.persistence.*;

@Entity
public class DetailChampionnat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailChamp;

    private String code;
    private String description;

    // 🔹 Constructeur vide
    public DetailChampionnat() {
    }

    // 🔹 Constructeur avec paramètres
    public DetailChampionnat(String code, String description) {
        this.code = code;
        this.description = description;
    }

    // 🔹 Getters & Setters
    public Long idDetailChamp() {
        return idDetailChamp;
    }

    public void idDetailChamp(Long idDetailChamp) {
        this.idDetailChamp = idDetailChamp;
    }

    public String code() {
        return code;
    }

    public void code(String code) {
        this.code = code;
    }

    public String description() {
        return description;
    }

    public void description(String description) {
        this.description = description;
    }
}
