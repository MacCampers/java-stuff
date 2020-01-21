package projetPersonnev1;

public class Personne {

	// par defaut on met les attributs en privé normalement
	private String nom;
	private String prenom;
	private int age;
	private int ageMin = 0;
	private int ageMax = 0;

	// setter
	public void setAge(int age) {
		if (age >= ageMin && age <= ageMax && age > this.age)
			this.age = age;
	}
	
	public void setNom(String nom) {
		if (!nom.isEmpty())
			this.nom = nom;
	}
	
	//getter
	public int getAge() {
		return this.age;
	}
	
	public String getNom() {
		return this.nom.toUpperCase();
	}
	
	public String getPrenom() {
		return this.nom.toLowerCase();
	}


	// constructor
	public Personne() {

	}

	// surcharge constructeur
	public Personne(String name, String surname) {
		this.nom = name;
		this.prenom = surname;
	}

	public Personne(String name, String surname, int age) {
		this.nom = name;
		this.prenom = surname;
		this.age = age;
	}

	// méthode toString générique qui retourne les infos concatenées
	public String toString() {
		String reponse = "NOM: " + getNom();
		reponse += "\tPRENOM: " + prenom;
		reponse += "\tAGE: " + age;
		return reponse;
	}
}
