package model;

public class Villes {
	private String nom;
	private String capitale;
	private double nbHabitants;
	private String pays;
	private String categorie;
	private boolean isCapital;
	public final double nbMin = 0;
	public final double nbMax = 10;
	public final String regle = "0-1-petit;1-3-moyen;3-10-grand";

	public Villes(String nom, String capitale, double nbHabitants, String pays) {
		this.nom = nom;
		this.capitale = capitale;
		setNbHabitants(nbHabitants);
		this.pays = pays;
		isCapital();
		computeCategorie();
	}

	public double getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(double nbHabitants) {
		if (nbHabitants > nbMin && nbHabitants < nbMax) {
			this.nbHabitants = nbHabitants;
			computeCategorie();
		}
	}

	public String getNom() {
		return nom;
	}

	public String getCapitale() {
		return capitale;
	}

	public String getPays() {
		return pays;
	}

	public String getCategorie() {
		return this.categorie;
	}

	private void computeCategorie() {
		if (nbHabitants > 0 && nbHabitants <= 1)
			this.categorie = "petite";
		else if (nbHabitants > 1 && nbHabitants <= 3)
			this.categorie = "moyenne";
		else
			this.categorie = "grande";
	}

	public boolean isCapital() {
		if (this.nom == this.capitale)
			isCapital = true;
		return isCapital;
	}

	public String toString() {
		return "Villes [nom=" + nom + ", capitale=" + capitale + ", nbHabitants=" + nbHabitants + ", pays=" + pays
				+ ", categorie=" + categorie + ", isCapital=" + isCapital + "]";
	}
}
