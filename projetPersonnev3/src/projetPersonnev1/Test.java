package projetPersonnev1;

public class Test {
	public static void main(String[] args) {
		test2();
	}

	static void test1() {
		Personne p = new Personne("dupond", "toto");
		System.out.println(p.toString());
		// appel implicite de toString dans ces deux cas :
		System.out.println(p);
		String str = p + "";
	}
	
	static void test2() {
		Personne p = new Personne("dupond", "toto");
		p.setAge(2);
		System.out.println(p);
		System.out.println(p.getNom());
	}

}
