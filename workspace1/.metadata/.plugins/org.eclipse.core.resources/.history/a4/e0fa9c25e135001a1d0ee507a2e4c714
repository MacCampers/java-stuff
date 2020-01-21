package projetCommande;

public class Commande {
	private Plat plat;
	private Dessert dessert;
	private Boisson boisson;
	private int prix;
	private String paramChoisi;
	private String str;
	
	public Commande(Plat plat, Dessert dessert, Boisson boisson, String paramChoisi) {
		this.plat = plat;
		this.dessert = dessert;
		this.boisson = boisson;
		this.paramChoisi = paramChoisi;
		System.out.println(paramChoisi);
	}

	public int getPrixTotal() {
		int prixFinal = this.plat.getPlatPrix() + this.dessert.getDessertPrix() + this.boisson.getBoissonPrix();
		return prixFinal;
	}
	
	public String toString() {
		if (paramChoisi.equalsIgnoreCase("A"))
			str = "Prix total : " + getPrixTotal() + "€";
		else
			str = "Détail :\n" + this.plat.toString() + "\n"  + this.dessert.toString() + "\n" + this.boisson.toString();
		return str;
	}
	
}
