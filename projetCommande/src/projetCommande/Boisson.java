package projetCommande;

public enum Boisson {
	coca(2), eau(1), sans;

	private int prix = 0;

	Boisson(int prix) {
		this.prix = prix;
	}

	Boisson() {

	}

	public int getBoissonPrix() {
		return this.prix;
	}

	public String toString() {
		return name() + " " + prix + "€";
	}
}
