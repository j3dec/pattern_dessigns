package fr.diginamic.state;

public class DemoAvion {

	public static void main(String[] args) {
		Avion avion = new Avion();
		// Sol
		avion.setEtat(new AvionSol());
		avion.rentrerTrainAtterrissage();
		avion.sortirTrainAtterrissage();
		// Vol
		avion.setEtat(new AvionVol());
		avion.rentrerTrainAtterrissage();
		avion.sortirTrainAtterrissage();
		// Approche
		avion.setEtat(new AvionApproche());
		avion.rentrerTrainAtterrissage();
		avion.sortirTrainAtterrissage();

	}

}
