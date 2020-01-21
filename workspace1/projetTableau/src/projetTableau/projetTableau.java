package projetTableau;

public class projetTableau {
	public static void main(String[] args) {
		testCalcul();
	}

	/* Cours sur les tableau */
	static void testCalcul() {
		int x = 10;
		int y = 5;
		int[] res = calculTest(x, y);
		System.out.println(res[0] + "\t" + res[1]);
	}
	
	static int[] calculTest(int a, int b) {
		int [] tab = new int[2];
		tab[0] = a + b;
		tab[1] = a - b;
		return tab;
	}
	
	static void testint4() {
		String[] tab = { "aaa", "bbb", "ssss" };
		// foreach example
		for (String e : tab)
			System.out.println(e);
	}

	static void testint3() {
		int[] tab = { 1, 10, 100, 1000 };
		String[] tab2 = { "aaa", "bbb", null, "ssss" };
		for (int i = 0; i < tab2.length; i++)
			if (tab2[i] != null)
				System.out.println(tab2[i].toUpperCase());
	}

	static void testint2() {
		int[] tab = new int[3];
		tab[0] = 10;
		tab[2] = 100;
		for (int i = 0; i < tab.length; i++)
			System.out.println(tab[i]);
	}

	static void testint1() {
		int[] tab = new int[3];
		System.out.println(tab[0]);
		tab[0] = 10;
		System.out.println(tab[0]);
	}
}
