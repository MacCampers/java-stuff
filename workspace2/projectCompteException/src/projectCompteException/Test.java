package projectCompteException;

public class Test {
	public static void main(String[] args) {
		test1();
	}
	
	public static void test1() {
		CompteSimple c1 = new CompteSimple("boursorama");
		System.out.println(c1.toString());
		CompteSimple c2 = new CompteSimple("lcl", 800);
		System.out.println(c2.toString());
		c2.crediter(800);
		System.out.println(c2.toString());
		c2.debiter(1000);
		System.out.println(c2.toString());
		c2.virement(100, c1);
		System.out.println();
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
