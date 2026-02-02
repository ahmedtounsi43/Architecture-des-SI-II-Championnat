package tn.esprit.ds.championnat.entities;

import jakarta.persistence.*;

@Entity

public class championnat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_championnat;

    @Enumerated(EnumType.STRING)
    private Categorie categorie;

    private String libelleC;

    private Integer annee;

    // 🔹 Constructeur vide (obligatoire pour JPA)
    public void Championnat() {
    }

    // 🔹 Constructeur avec paramètres
    public void Championnat(Categorie categorie, String libelleC, Integer annee) {
        this.categorie = categorie;
        this.libelleC = libelleC;
        this.annee = annee;
    }

    // 🔹 Getters & Setters (sans getX / getY comme tu préfères 😉)

    public Long id_championnat() {
        return id_championnat;
    }

    public void id_championnat(Long id_championnat) {
        this.id_championnat = id_championnat;
    }

    public Categorie categorie() {
        return categorie;
    }

    public void categorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public String libelleC() {
        return libelleC;
    }

    public void libelleC(String libelleC) {
        this.libelleC = libelleC;
    }

    public Integer annee() {
        return annee;
    }

    public void annee(Integer annee) {
        this.annee = annee;}
}
