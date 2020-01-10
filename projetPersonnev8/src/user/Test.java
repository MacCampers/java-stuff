package user;

import model.*;

public class Test {
	public static void main(String[] args) {
		test1();
	}

	static void test1() {
		Adresse adr = new Adresse(161, " verdun", " 94200");
		Personne p = new Personne("dupond", "toto");
		p.setAdresse(adr);
		adr.setPersonne(p);
		System.out.println(p.getAdresse().getCp());
		System.out.println(adr.getPersonne().getNom());
	}
}
