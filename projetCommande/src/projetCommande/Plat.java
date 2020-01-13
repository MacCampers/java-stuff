package projetCommande;

public enum Plat {
	duJour(2),
	salade(1),
	riz;
	
	private int prix = 0;
	
	Plat(int prix) {
		this.prix = prix;
	}
	
	Plat() {
		
	}
	
	
	public int getPlatPrix() {
		return this.prix;
	}
	
	public String toString() {
		return name() + " " + prix + "€";
	}
}
