package fr.diginamic.state;

public class Avion {

	private AvionEtat etat;

	private String etatTrain;

	public void rentrerTrainAtterrissage() {
		etat.rentrerTrainAtterrissage();
	}

	public void sortirTrainAtterrissage() {
		etat.sortirTrainAtterrissage();
	}

	/** Getter
	 * @return the etat
	 */
	public AvionEtat getEtat() {
		return etat;
	}

	/** Setter
	 * @param etat the etat to set
	 */
	public void setEtat(AvionEtat etat) {
		this.etat = etat;
	}
}
