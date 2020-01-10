package projectStatic;

public class Test {

	public static void main(String[] args) {
//		test1();
		test2();
	}
	
	static void test2() {
		Personne p1 = new Personne("test11");
		Personne p2 = new Personne("test22");
		p1.setPrenom("huhu");
		Personne.setNom("hahah");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(Personne.getCompteur());
	}
	
	static void test1() {
		A.m1();
		A a = new A();
		a.m3();
		new A().m4();
	}
}
