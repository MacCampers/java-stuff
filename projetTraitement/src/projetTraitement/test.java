package projetTraitement;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		testCalculJacky();
	}

	static void testCalculJacky() {
		Scanner clavier = new Scanner(System.in);
		System.out.print("Veuillez saisir les deux opérandes\n1er opérande : ");
		double op1 = clavier.nextDouble();

		System.out.print("2ème opérande  (autre que 0 pour la division) : ");
		double op2 = clavier.nextDouble();
		Scanner clavierstr = new Scanner(System.in);

		System.out.println(
				"Veuillez choisir  dans la liste suivante l'opérateur voulu:\n +/add\t -/sous\t */mult\t / div");
		String operateur = clavierstr.nextLine();
		double r = Traitement.calcul(op1, op2, operateur);

		String str = "le résultat de l'opération : " + op1 + " " + operateur + " " + op2 + " = " + r;
		System.out.println(str);
	}
}
