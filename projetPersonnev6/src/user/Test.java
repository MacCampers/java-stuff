package user;

import model.*;

public class Test {
	public static void main(String[] args) {
		test1();
	}

	static void test1() {
		Adresse adr = new Adresse(161, " verdun", " 94200");
		Info inf = new Info(161, 1.7);
		Personne p = new Personne("dupond", "toto", adr, 70, 10.2);
		System.out.println(p);
	}
	
//	static void test2() {
//		Adresse adr = new Adresse(161, " verdun", " 94200");
//		Info inf = new Info(16, 1.7);
//		Personne p = new Personne("dupond", "toto", adr, inf);
//		System.out.println(p);
//		System.out.println(p.getInfo().getTaille());
//		p.getInfo().setPoid(8);
//		System.out.println(p);
//	}
}
