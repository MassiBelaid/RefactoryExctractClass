package main;

import application.Voiture;

public class Main {

	public static void main(String[] args) {
		
		//Instanciation d'une clio
		Voiture Clio = new Voiture("Renault", "Clio 5", 2020, 3, 95, 4, "Essence");
		System.out.println(Clio.getModele());

	}

}
