package projetPersonnev1;

public class Test {
	public static void main(String[] args) {
		test1();
	}

	static void test1() {
		Personne p = new Personne();
		p.nom = "Tabry";
		p.prenom = "Benoit";
		System.out.println(p.getInfo());

		// affecter une classe a une autre
		Personne p2 = new Personne();
		p2 = p;
		System.out.println(p2.getInfo());

		// tableau de classe personne
		Personne p3 = new Personne();
		p3 = p2;
		// Personne[] tab = new Personne[3];
		Personne[] tab = { p, p2, p3 };
		tab[0].nom = "test";
		for(Personne pers: tab)
			System.out.println(pers.getInfo());
	}
}
