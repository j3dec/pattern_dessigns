package fr.diginamic.builder;

public class ZooBuilder {
    private Zoo zoo;
    private Zone zone;
    private Animal animal;

    public ZooBuilder(String nom) {
        this.zoo = new Zoo();
        this.zoo.setNom(nom);
    }

    public ZooBuilder appendZone(String nom, int capacite){
        this.zone = new Zone();
        this.zone.setNom(nom);
        this.zone.setCapacite(capacite);
        return this;
    }

    public ZooBuilder appendAnimal(String nomZone, String nom) {
        this.animal = new Animal();
        this.animal.setNom(nom);
        return this;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
