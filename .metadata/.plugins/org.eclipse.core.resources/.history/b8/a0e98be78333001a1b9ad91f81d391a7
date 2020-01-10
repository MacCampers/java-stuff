package projetCommande;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		Scanner sc1 = new Scanner(System.in);
		Boisson[] tabBoisson = Boisson.values();
		System.out.println("Quel Boisson voulez vous ?");
		for(Boisson f: tabBoisson)
			System.out.print(f.toString() + "\t");
		System.out.println();
		String choix1 = sc1.nextLine();
		Boisson b = Boisson.valueOf(choix1);
		
		Scanner sc2 = new Scanner(System.in);
		Plat[] tabPlat = Plat.values();
		System.out.println("Quel Plat voulez vous ?");
		for(Plat f: tabPlat)
			System.out.print(f.toString() + "\t");
		System.out.println();
		String choix2 = sc2.nextLine();
		Plat p = Plat.valueOf(choix2);
		
		Scanner sc3 = new Scanner(System.in);
		Dessert[] tabDessert = Dessert.values();
		System.out.println("Quel Dessert voulez vous ?");
		for(Dessert f: tabDessert)
			System.out.print(f.toString() + "\t");
		System.out.println();
		String choix3 = sc3.nextLine();
		Dessert d = Dessert.valueOf(choix3);
		
		System.out.println("Que voulez vous: A ou B ?\nA: Prix total\nB: Détail facture");
		Scanner sc4 = new Scanner(System.in);
		String choix4 = sc4.nextLine();
		Commande c = new Commande(p, d, b, choix4);
		System.out.println(c);
	}

}
