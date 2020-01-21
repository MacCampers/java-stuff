package User;

import model.*;

public class Test {
	public static void main(String[] args) {
		test1();
	}

	static void test1() {
		Groupe group = new Groupe("CGI", 10);
		Personne p1= new Personne(1, "aaaa", "aaaa", 10);
		Personne p2= new Personne(2, "aaaa", "aaaa", 15);
		Personne p3= new Personne(3, "aaaa", "aaaa", 16);
		group.add(p1);
		group.add(p2);
		group.add(p3);
		group.remove(2);
		System.out.println(group);
		System.out.println(group.getCount("aa"));
	}
}
