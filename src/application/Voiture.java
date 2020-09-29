package application;


public class Voiture {
	
	//Attributs de voiture
	private String marque;
	private String modele;
	private int année;
	private int nombrePorte;
	
	//Attributs partie moteur de la voiture
	private int puissance;
	private int nombreCylindre;
	private String typeCarburant;
	
	
	
	//Constructeur
	public Voiture(String marque, String modele, int année, int nombrePorte, int puissance, int nombreCylindre,
			String typeCarburant) {
		this.marque = marque;
		this.modele = modele;
		this.année = année;
		this.nombrePorte = nombrePorte;
		this.puissance = puissance;
		this.nombreCylindre = nombreCylindre;
		this.typeCarburant = typeCarburant;
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
	public int getAnnée() {
		return année;
	}
	public void setAnnée(int année) {
		this.année = année;
	}
	public int getNombrePorte() {
		return nombrePorte;
	}
	public void setNombrePorte(int nombrePorte) {
		this.nombrePorte = nombrePorte;
	}
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	public int getNombreCylindre() {
		return nombreCylindre;
	}
	public void setNombreCylindre(int nombreCylindre) {
		this.nombreCylindre = nombreCylindre;
	}
	public String getTypeCarburant() {
		return typeCarburant;
	}
	public void setTypeCarburant(String typeCarburant) {
		this.typeCarburant = typeCarburant;
	}
	
	
}
