package projetTPArticle;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		tpArticle();
	}

	static void tpArticle() {
		Random r = new Random();
		Articles a1 = new Articles("brand1", r.nextInt(200));
		Articles a2 = new Articles("brand2", r.nextInt(200));
		Articles a3 = new Articles("brand3", r.nextInt(200));

		Articles[] tab = { a1, a2, a3 };
		for (Articles e: tab) {
			System.out.println(e.toString());
		}
		
	}
}
