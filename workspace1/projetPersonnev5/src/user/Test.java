package user;

import model.*;

public class Test {
	public static void main(String[] args) {
		test1();
	}
	
	static void test3() {
		Adresse adr = new Adresse(161, " verdun", " 94200");
		adr.setNumero(1800);
		System.out.println(adr);
	}
	
	static void test2() {
		Personne p = new Personne("dupond", "toto");
		System.out.println(p);
	}

	static void test1() {
		Adresse adr = new Adresse(161, " verdun", " 94200");
		Personne p = new Personne("dupond", "toto", adr);
		System.out.println(p);
		p.getAdresse().setNumero(1888); 
		System.out.println(p);
	}
}
