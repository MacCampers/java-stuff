package model;

public class A {
	public void m1() {
		System.out.println("je suis m1 de A");
	}
	
	public void m() {
		System.out.println("je suis m de A");
	}
	
	public String toString() {
		return "c'est toString de A " + getClass().getName();
	}
}
