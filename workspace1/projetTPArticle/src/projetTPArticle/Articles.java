package projetTPArticle;

public class Articles {
	private String marque;
	private int prix;
	private String status;
	// globale constante
	public final int prixMin = 0;
	public final int prixPivot = 100;

	Articles(String marque) {
		this.marque = marque;
	}

	Articles(String marque, int prix) {
		setPrix(prix);
		if (!marque.isEmpty())
			this.marque = marque;
	}

	public void setPrix(int prix) {
		if (prix >= prixMin) {
			this.prix = prix;
			computeStatus(prix);
		}
	}

	private void computeStatus(int prix) {
		if (prix < prixPivot)
			this.status = "C'est pas cher";
		else
			this.status = "c'est cher";
	}

	public int getPrix() {
		return this.prix;
	}

	public String getMarque() {
		return this.marque;
	}

	public String getStatus() {
		return this.status;
	}

	public String toString() {
		return "PRIX: " + getPrix() + "€\tMARQUE: " + getMarque() + "\t-> " + getStatus();
	}

}
