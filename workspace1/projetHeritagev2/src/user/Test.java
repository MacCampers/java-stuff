package user;

import model.*;

public class Test {

	public static void main(String[] args) {
		test1();
	}

	static void test1() {
		DeuxD a = new DeuxD(10, 20);
		System.out.println(a.toString());
		TroisD b = new TroisD(10, 20, 30);
		System.out.println(b);
	}
}
