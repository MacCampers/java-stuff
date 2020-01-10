package projetCommande;

public enum Dessert {
	fruit(2), gateau(1), sans;

	private int prix;

	Dessert(int prix) {
		this.prix = prix;
	}

	Dessert() {

	}

	public int getDessertPrix() {
		return this.prix;
	}

	public String toString() {
		return name() + " " + prix + "€";
	}
}
