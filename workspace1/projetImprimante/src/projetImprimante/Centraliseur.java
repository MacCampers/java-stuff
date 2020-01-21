package projetImprimante;

public class Centraliseur {
	private static Centraliseur instance = new Centraliseur();
	private Imprimante[] tab = { new Imprimante("IP1"), new Imprimante("IP2") };
	private boolean b;

	private Centraliseur() {

	}

	public static Centraliseur getInstance(String message) {
		return instance;
	}
	
	public void print(String message) {
		if (b)
			tab[1].print(message);
		else
			tab[0].print(message);
		b =! b;
	}
}
