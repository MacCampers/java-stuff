package user;

import model.*;

public class Test {

	public static void main(String[] args) {
		test6();
	}

	static void test1() {
		Velo velo = new Velo("Ciraptor", 550);
		Voiture voiture = new Voiture("K200", 484848);
		Vehicule vehicule = new Vehicule("ORKIN", 0);
		Bateau bato = new Bateau("caravel", 3000, Ebateau.grand);
		
		Vehicule[] tab = {velo, voiture, vehicule, bato};
		for (Vehicule v: tab)
			System.out.println(v.avancer());
	}
	
	static void test2() {
		Vehicule vehicule = new Vehicule("bbbbb", 0);
		Object vehicule2 = new Vehicule("aaaa", 0);
		System.out.println(vehicule2);
		Object bateau = new Bateau("ezaezaeza", 41052, Ebateau.moyen);
		System.out.println(bateau);
	}
	
	static void test5() {

		Voiture v1 = new Voiture("K200", 484848);
		Vehicule v2 = v1;
		Voiture v3 = (Voiture) v2;
	}
	
	static void test6() {
		Vehicule v1 = new Vehicule("ORKIN", 0);		
		Velo v2 = new Velo("Ciraptor", 550);
		Voiture v3 = new Voiture("K200", 484848);
		Bateau v4 = new Bateau("caravel", 3000, Ebateau.grand);
		testAvance(v1);
		testAvance(v2);
		testAvance(v3);
		testAvance(v4);
	}
	
	static void testAvance(Vehicule v) {
		System.out.println(v.avancer());
	}
}
