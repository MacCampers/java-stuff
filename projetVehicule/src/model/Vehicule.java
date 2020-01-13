package model;

public class Vehicule {
	private String marque;
	private int prix;

	public Vehicule(String marque, int prix) {
		this.marque = marque;
		this.prix = prix;
	}
	
	public String avancer(String moyen) {
		return moyen;
	}

	public String toString() {
		return "Vehicule [marque=" + marque + ", prix=" + prix + "]";
	}

}
