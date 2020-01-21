package projetImprimante;

public class Imprimante {
	private String name;

	public Imprimante(String name) {
		this.name = name;
	}

	public void print(String message) {
		System.out.println(message + "\t" + name);
	}

}
