package application;


public class Voiture {
	
	//Attributs de voiture
	private String marque;
	private String modele;
	private int annee;
	private int nombrePorte;
	
	private CaracMoteur partieMoteur = new CaracMoteur();



	//Constructeur
	public Voiture(String marque, String modele, int annee, int nombrePorte, int puissance, int nombreCylindre,
			String typeCarburant) {
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
		this.nombrePorte = nombrePorte;
		this.partieMoteur.setPuissance(puissance);
		this.partieMoteur.setNombreCylindre(nombreCylindre);
		this.partieMoteur.setTypeCarburant(typeCarburant);
	}
	
	
	//Getter And Setter
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public int getNombrePorte() {
		return nombrePorte;
	}
	public void setNombrePorte(int nombrePorte) {
		this.nombrePorte = nombrePorte;
	}
	public int getPuissance() {
		return partieMoteur.getPuissance();
	}
	public void setPuissance(int puissance) {
		this.partieMoteur.setPuissance(puissance);
	}
	public int getNombreCylindre() {
		return partieMoteur.getNombreCylindre();
	}
	public void setNombreCylindre(int nombreCylindre) {
		this.partieMoteur.setNombreCylindre(nombreCylindre);
	}
	public String getTypeCarburant() {
		return partieMoteur.getTypeCarburant();
	}
	public void setTypeCarburant(String typeCarburant) {
		this.partieMoteur.setTypeCarburant(typeCarburant);
	}
	
	
}
