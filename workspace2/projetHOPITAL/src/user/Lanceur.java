package user;

import java.util.Scanner;
import model.*;

public class Lanceur {

	public static void main(String[] args) {
		saisieLogs();
	}

	static void saisieLogs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenue à l'hopital.\n");
		System.out.print("Login: ");
		String login = sc.nextLine();
		System.out.print("Password: ");
		String password = sc.nextLine();
		System.out.print("Metier: ");
		int metier = sc.nextInt();
		Hopital.login(login, password, metier);
		if (metier > 0 && metier < 3)
			saisieMedecin();
		else
			saisieSecretaire();
	}
	
	static void saisieMedecin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nBienvenue à l'interface Médecin.\n______________________________________");
		System.out.println("1 - Affichier l'état de la file d'attente");
		System.out.println("2 - Ajouter une ordonnance au patient actuel");
		System.out.println("3 - Sauvegarde de la BDD de la list des visites");
		System.out.println("4 - Rendre la salle disponible");
		System.out.println("5 - Quitter");
		System.out.print("Veuillez entrer votre choix: ");
		int choix = sc.nextInt();
		if (choix == 5)
			quitter("Medecin");
		else
			Medecin.choixMedecin(choix);
	}
	
	static void saisieSecretaire() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nBienvenue à l'interface Secretaire.\n______________________________________");
		System.out.println("1 - Rajouter un patient");
		System.out.println("2 - Sauvegarder la liste d'attente");
		System.out.println("3 - Charger la liste d'attente");
		System.out.println("4 - Nouvelle journée");
		System.out.println("5 - Afficher l'état de la file d'attente");
		System.out.println("6 - Afficher les visites d'un patient");
		System.out.println("7 - Afficher toutes les visites");
		System.out.println("8 - Afficher toutes les visites d'un médecin");
		System.out.println("9 - Quitter");
		System.out.print("Veuillez entrer votre choix: ");
		int choix = sc.nextInt();
		if (choix == 9)
			quitter("Secrétaire");
	}
	
	static void quitter(String status) {
		System.out.println("\nVous avez quitter l'interface " + status + ".\n");
		saisieLogs();
	}

}
