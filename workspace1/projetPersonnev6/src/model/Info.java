package model;

public class Info {
	private int poid;
	private double taille;
	
	public void setPoid(int poid) {
		this.poid = poid;
	}

	public double getTaille() {
		return taille;
	}
	
	public Info(int poid, double taille) {
		this.poid = poid;
		this.taille = taille;
	}

	public String toString() {
		return "Info [poid=" + poid + ", taille=" + taille + "]";
	}	
}
