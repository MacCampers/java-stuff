package user;

import model.*;

public class Test {
	public static void main(String[] args) {
		test1();
	}

	static void test1() {
		int exp = 3;
		Rib rib = new Rib("ssg", "test123");
		Salarie p = new Salarie(1, "dupond", "toto", rib, exp);
		System.out.println(p);
	}
}
