package fr.diginamic.state;

public class AvionApproche implements AvionEtat{

    @Override
    public void rentrerTrainAtterrissage() {
        System.out.println("Nous allons atterrir. Il est impossible de rentrer le train d'atterrissage.");

    }

    public void sortirTrainAtterrissage() {
        System.out.println("Nous allons atterrir. Le train d'atterrissage est sorti.");

    }
}
