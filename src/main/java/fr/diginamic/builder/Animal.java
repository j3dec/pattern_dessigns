package fr.diginamic.builder;

public class Animal extends Zone{
    public String nom;

    @Override
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
