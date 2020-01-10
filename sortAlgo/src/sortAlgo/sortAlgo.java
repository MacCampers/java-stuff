package sortAlgo;

import java.util.Random;
import java.util.stream.IntStream;

public class sortAlgo {
	public static void main(String[] args) {
		init();
	}

	static void init() {
		int[] tab = IntStream.generate(() -> new Random().nextInt(10)).limit(10).toArray();
		System.out.println("Liste non triée:");
		printTable(tab);
		sortTable(tab);
		System.out.println("Liste triée:");
		printTable(tab);
	}

	static void sortTable(int[] tab) {
		for (int j = 0; j < tab.length - 1 ; j++) {
			for (int i = tab.length - 1; i > 0; i--) {
				if (tab[i] < tab[i - 1]) {
					swap(tab, i, i - 1, tab[i], tab[i - 1]);
				}
			}
		}
	}

	static void swap(int[] tab, int pos1, int pos2, int val1, int val2) {
		tab[pos1] = val2;
		tab[pos2] = val1;
	}

	static void printTable(int[] tab) {
		for (int e : tab)
			System.out.print(e + "\t");
		System.out.println();
	}
}
