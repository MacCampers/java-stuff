package model;

public class Voiture extends Vehicule {
	private boolean gps;

	public Voiture(String marque, int prix, boolean gps) {
		super(marque, prix);
		this.gps = gps;
	}
	
	public void gpsOnOff() {
		this.gps =! this.gps;
	}
	
	public void avancer() {
		super.avancer("Je roule");
	}

	public String toString() {
		return "Voiture [gps=" + gps + "]";
	}
	
	
}
