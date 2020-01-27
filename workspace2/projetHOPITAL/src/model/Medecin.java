package model;

import java.util.InputMismatchException;

public class Medecin {
	private int id;
	private String nom;
	private String prenom;
	private int salle;

	public Medecin(String nom, String prenom, int salle) {
		this.nom = nom;
		this.prenom = prenom;
		this.salle = salle;
	}


	public static void choixMedecin(int choix) {
		try {
			switch (choix) {
			case 1:
				etatFileDattente();
				break;
			case 2:
				ajouterOrdonnance();
				break;
			case 3:
				sauvegarderVisites();
				break;
			case 4:
				salleDisponible();
				break;
			default:
				System.out.println("Input Invalide");
				break;
			}
		} catch (InputMismatchException err) {
			System.out.println("\nINVALID INPUT!");
		}
	}

	private static void etatFileDattente() {
		// print file d'attente
	}

	private static void ajouterOrdonnance() {
		// remplir medecin, tarif et ordonance
	}

	private static void sauvegarderVisites() {
		// créer visite table visite (create avec id_visite, id_patient, date et
		// num_salle) les patients qui sont sorti de la file d'attente
	}

	private static void salleDisponible() {
		// rendre une salle disponible en stockant le 1er patient de la file d'attente
		// qui viendra dans la salle pour ensuite le save
	}

}
