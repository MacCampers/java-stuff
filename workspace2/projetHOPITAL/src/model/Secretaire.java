package model;

import java.util.InputMismatchException;

public class Secretaire {
	private int id;
	private String nom;
	private String prenom;

	public Secretaire(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public static void choixMedecin(int choix) {
		try {
			switch (choix) {
			case 1:
				ajouterPatient();
				break;
			case 2:
				sauvegarderListe();
				break;
			case 3:
				chargerListe();
				break;
			case 4:
				nouvelleJournée();
				break;
			case 5:
				afficherFile();
				break;
			case 6:
				afficherVisitesPatient();
				break;
			case 7:
				affichierVisites();
				break;
			case 8:
				afficherVisitesMedecin();
				break;
			default:
				System.out.println("Input Invalide");
				break;
			}
		} catch (InputMismatchException err) {
			System.out.println("\nINVALID INPUT!");
		}
	}


	private static void ajouterPatient() {
		// demander id patient, si il existe pas , le creer en demandant nom, prenom etc, 
		// si il existe deja, on affiche le patient 
	}
	
	private static void sauvegarderListe() {
		// sauvegarder file d'atente dans un fichier xml ou quoi
	}
	
	private static void chargerListe() {
		// charger la liste d'attente depuis un fichier
	}
	
	private static void nouvelleJournée() {
		// print file d'attente (select db)
	}
	
	private static void afficherFile() {
		// print file d'attente
	}
	
	private static void afficherVisitesPatient() {
		// print visites from patient_id (select db)
	}
	
	private static void affichierVisites() {
		// print visites (select db)
	}
	
	private static void afficherVisitesMedecin() {
		// print visite from medecin (select db)
	}
}
