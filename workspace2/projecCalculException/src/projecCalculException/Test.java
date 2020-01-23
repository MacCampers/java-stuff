package projecCalculException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// saisir nb 1, nb2 et operateur =>> calcul();
		try {
			Scanner clavier = new Scanner(System.in);
			System.out.print("Veuillez saisir les deux opérandes\n1er opérande : ");
			double op1 = clavier.nextDouble();

			System.out.print("2ème opérande  (autre que 0 pour la division) : ");
			double op2 = clavier.nextDouble();
			Scanner clavierstr = new Scanner(System.in);

			if (op1 < 0 || op2 < 0)
				throw new RuntimeException();

			System.out.println(
					"Veuillez choisir  dans la liste suivante l'opérateur voulu:\n +/add\t -/sous\t */mult\t / div");
			String operateur = clavierstr.nextLine();
			double r = Traitement.calcul(op1, op2, operateur);
			String str = "le résultat de l'opération : " + op1 + " " + operateur + " " + op2 + " = " + r;
			System.out.println(str);
		} catch (InputMismatchException e) {
			System.out.println("bad format argument");
		} catch (RuntimeException e) {
			System.out.println("argument cannot be negative");
		}

	}

}
