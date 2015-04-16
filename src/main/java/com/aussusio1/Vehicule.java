package com.aussusio1;

public class Vehicule {
	int prix = 8;
	String nom = "";
	Option option1 = new Option();
	Option option2 = new Option();

	public Vehicule(int prix) {
		super();

		this.prix = prix;
	}

	public int calculerPrix() {
		if (prix < 0) {
			throw new RuntimeException("prix non valide");
		}
		return prix + option1.prix + option2.prix;
	}

	public Vehicule() {
		super();
	}
}