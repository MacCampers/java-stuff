package model;

public class Velo extends Vehicule {
	
	public Velo(String marque, int prix) {
		super(marque, prix);
	}
	
	public void avancer() {
		super.avancer("Je roule à deux roues");
	}
	
}
