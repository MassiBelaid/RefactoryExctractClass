package application;

public class CaracMoteur {
	private int puissance;
	private int nombreCylindre;
	private String typeCarburant;

	public CaracMoteur() {
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