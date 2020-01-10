package projetPersonnev1;

public class Test {
	public static void main(String[] args) {
		test2();
	}

	static void test1() {
		Personne p = new Personne();
		p.nom = "Tabry";
		p.prenom = "Benoit";
		p.age = 25;
		System.out.println(p.getInfo());
	}

	static void test2() {
		Personne x = new Personne("toto", "teiet", 10);
		Personne[] tab = { new Personne(), new Personne("aa", "bb"), new Personne("aaaa", "bbbbbb", 19), x };
		for (Personne p : tab) {
			System.out.println(p.getInfo() + "\n----------------");
		}
	}
}
