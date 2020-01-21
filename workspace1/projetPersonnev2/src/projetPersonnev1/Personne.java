package projetPersonnev1;

public class Personne {

	String nom;
	String prenom;
	int age;
	String status;
	int ageMineur = 18;

	Personne() {

	}

	// surcharge constructeur
	Personne(String name, String surname) {
		this.nom = name;
		this.prenom = surname;
	}
	Personne(String name, String surname, int age) {
		this.nom = name;
		this.prenom = surname;
		this.age = age;
	}

	String getInfo() {
		String reponse = "NOM: " + nom;
		reponse += "\tPRENOM: " + prenom;
		reponse += "\tAGE: " + age;
		reponse += "\tSTATUS: ";
		reponse += age < ageMineur ? " mineur" : " majeur";
		return reponse;
	}
}
