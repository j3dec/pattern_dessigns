package fr.diginamic.state;

public class AvionVol implements AvionEtat {
    @Override
    public void rentrerTrainAtterrissage() {
        System.out.println("Train d'atterrissage rentré.");

    }

    public void sortirTrainAtterrissage() {
        System.out.println("L'avion est en vol. Il est interdit de sortir le train d'atterrissage.");

    }
}
