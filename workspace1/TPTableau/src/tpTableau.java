import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class tpTableau {
	public static void main(String[] args) {
		// tpTableau();
		// tpDoublerTableau();
		// tpDoublerTableauv2();
		// tpOccurence();
		// tpReverse();
		tpTraitementText();
	}

	static void tpTraitementText() {
		System.out.print("Veuillez saisir une phrase : ");
		Scanner clavier = new Scanner(System.in);
		String phrase = clavier.nextLine();
		String reponse = traitementText(phrase);
		System.out.print("La nouvelle phrase est : ");
		System.out.println(reponse);
	}

	static String traitementText(String text) {
		String[] tab = spliter(text);
		String[] tabReverse = reverse(tab);
		String phrase = convertArrayToString(tabReverse);
		phrase = phrase.toUpperCase();
		return phrase;
	}

	public static String convertArrayToString(String[] strArray) {
		String joinedString = String.join(" ", strArray);
		return joinedString;
	}

	static String[] spliter(String str) {
		String[] tab = str.split(" ");
		return tab;
	}

	static String[] reverse(String[] x) {
		String[] tab = new String[x.length];
		for (int i = 0; i < x.length; i++) {
			tab[i] = x[x.length - i - 1];
		}
		return tab;
	}

	static void tpReverse() {
		int[] tab1 = { 10, 20, 30, 40 };
		int[] tab2 = reverse(tab1);
		printTableau(tab1);
		printTableau(tab2);
	}

	static int[] reverse(int[] x) {
		int[] tab = new int[x.length];
		for (int i = 0; i < x.length; i++) {
			tab[i] = x[x.length - i - 1];
		}
		return tab;
	}

	static void tpOccurence() {
		int[] tab = IntStream.generate(() -> new Random().nextInt(5)).limit(10).toArray();
		System.out.println("Choisir un element du tableau");
		printTableau(tab);
		System.out.println();
		Scanner clavier = new Scanner(System.in);
		int choix = clavier.nextInt();
		int compteur = occurence(choix, tab);
		System.out.println("le nombre " + choix + " apparait " + compteur + " fois.");
	}

	static int occurence(int x, int[] y) {
		int compteur = 0;
		for (int i = 0; i < y.length; i++) {
			if (y[i] == x)
				compteur++;
		}
		return compteur;
	}

	static void tpDoublerTableauv2() {
		int[] tab1 = { 10, 20, 30, 40, 50 };
		printTableau(tab1);
		doublerTableauv2(tab1);
		System.out.println();
		printTableau(tab1);
	}

	static void doublerTableauv2(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] *= 2;
		}
	}

	static void tpDoublerTableau() {
		int[] tab1 = { 10, 20, 30, 40, 50 };
		int[] tab2 = doublerTableau(tab1);
		printTableau(tab1);
		System.out.println();
		printTableau(tab2);
	}

	static int[] doublerTableau(int[] tab) {
		int[] tabDoubler = new int[tab.length];
		for (int i = 0; i < tab.length; i++) {
			tabDoubler[i] = tab[i] * 2;
		}
		return tabDoubler;
	}

	static void printTableau(int[] tab) {
		for (int e : tab)
			System.out.print(e + "\t");

		System.out.println();
	}

	static void tpTableau() {
		Scanner clavier = new Scanner(System.in);
		Scanner saisie = new Scanner(System.in);
		System.out.print("Veuillez saisir la taille du teableau souhaitée \n");
		int longueur = clavier.nextInt();
		String[] tab = new String[longueur];
		for (int i = 0; i < tab.length; i++) {
			System.out.print("Veuillez saisir l'élément n°" + (i + 1) + " du tableau \n");
			tab[i] = saisie.nextLine();
		}
		System.out.print("Voici un affichage du tableau demandé: \n");
		for (int j = 0; j < tab.length; j++) {
			System.out.print(tab[j] + " ");
		}

	}
}
