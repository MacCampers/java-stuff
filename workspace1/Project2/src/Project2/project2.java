package Project2;

import java.util.Scanner;

public class project2 {

	public static void main(String[] args) {
		// m1("benoit", "tabry", 25);
		// tpCalculSalaire();
		// testSomme();
		// testAffiche();
		///testCalculJacky();
	}

	///// TP calculette
	static void testCalculJacky() {
		Scanner clavier = new Scanner(System.in);
		System.out.print("Veuillez saisir les deux opérandes\n 1er opérande :");
		double op1 = clavier.nextDouble();
		System.out.print("2ème opérande  (autre que 0 pour la division):");
		double op2 = clavier.nextDouble();

		Scanner clavierstr = new Scanner(System.in);
		System.out.println(
				"Veuillez choisir  dans la liste suivante l'opérateur voulu:\n +/add\t -/sous\t */mult\t / div");
		String operateur = clavierstr.nextLine();
		double r=calcul(op1, op2, operateur);
		String str="le résultat de l'opération : " + op1 + " " + operateur + "" + op2 + " = " + r;
		System.out.println(str);
	}

	static double calcul(double op1, double op2, String operateur) {
		double resultat=0 ;
		switch (operateur) {
		case "+":
		case "add":
			resultat = op1+op2;
			break;
		case "-":
		case "sous":
			resultat = sous(op1, op2);
			break;
		case "*":
		case "mult":
			resultat = mult(op1, op2);
			break;
		case "/":
		case "div":
			resultat = div(op1, op2);
			break;

		}

		return resultat;

	}

	static double sous(double a, double b) {
		return a - b;
	}

	static double mult(double a, double b) {
		return a * b;
	}

	static double div(double a, double b) {
		return a / b;
	}

	static double add(double a, double b) {
		double res = a + b;
		return res;
	}

	/// SURCHARGES
	static void testAffiche() {
		affiche();
		affiche("test");
		affiche("test2", "test3");
	}

	static void affiche() {
		System.out.println("hello");
	}

	static void affiche(String name) {
		System.out.println("hello " + name);
	}

	static void affiche(String name, String surname) {
		System.out.println("hello " + surname + " " + name);
	}

	static void affiche(String name, int age) {
		System.out.println("hello " + name + ", " + name + " ans");
	}

	//// RETURN EXEMPLES
	static void testSomme() {
		int test = somme(10, 12);
		System.out.println(test);
	}

	static int somme(int a, int b) {
		int res = a + b;
		return res;
	}

	/// METHODES EXEMPLES
	static void m1(String prenom, String nom, int age) {
		String resultat = "Prenom : " + prenom.toLowerCase() + "\t";
		resultat += "Nom : " + nom.toUpperCase() + "\n";
		resultat += "Age : " + age + "\n";
		resultat += "Status : " + ((age < 18) ? "mineur" : "majeur");
		System.out.println(resultat);
	}

	static void tpCalculSalaire() {
		System.out.println("Veuillez entrer votre nom.");
		Scanner clavier = new Scanner(System.in);
		String name = clavier.nextLine();
		System.out.println("Veuillez entrer votre salaire brut annuel.");
		double salaire = clavier.nextInt();
		calculSalaire(name, salaire);
	}

	static void calculSalaire(String name, double salaire) {
		double salaireNet = salaire - ((salaire * 23) / 100);
		System.out.println("NOM: " + name + "\t Salaire net annuel: " + salaireNet + "€");
	}
}
