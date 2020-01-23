package projectException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//		test5();
		testmult();
	}
	
	static void testmult() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("nb1 :");
			int nb1 = sc.nextInt();
			System.out.println("nb2 : ");
			int nb2 = sc.nextInt();
			int res = Traitement.multiple(nb1, nb2);
			System.out.println(res);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("fin du programme");

	}

	static void testDiv2() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("nb1 :");
			int nb1 = sc.nextInt();
			System.out.println("nb2 : ");
			int nb2 = sc.nextInt();
			int res = Traitement.div(nb1, nb2);
			System.out.println(res);
		} catch (Exception e) {
			System.out.println("exception autre");
		}
		System.out.println("fin du programme");

	}

	static void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nb1 :");
		int nb1 = sc.nextInt();
		System.out.println("nb2 : ");
		int nb2 = sc.nextInt();
		try {
			int res = Traitement.div(nb1, nb2);
			System.out.println(res);
		} catch (ArithmeticException e) {
			System.out.println("division par 0");
		} catch (InputMismatchException e) {
			System.out.println("saisie incorecte");
		} catch (Exception e) {
			System.out.println("exception autre");
		}
		System.out.println("fin du programme");

	}

	static void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("saisir chiffre: ");
		String saisie = sc.nextLine();
		try {
			int a = Integer.parseInt(saisie);
			System.out.println(a);
		} catch (Exception e) {
			System.out.println("cas géré");
		} finally {
			System.out.println("in finally");
		}

	}

	static void test3() {
		int[] tab = { 1, 2 };
		System.out.println(tab[3]);
	}

	static void test2() {
		int a = 10;
		int b = 0;
		int c = a / b;
		System.out.println(c);
	}

	static void test1() {
		String str = "2a";
		int a = Integer.parseInt(str);
		System.out.println(a);
	}

}
