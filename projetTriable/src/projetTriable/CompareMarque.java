package projetTriable;

import java.util.Comparator;

public class CompareMarque implements Comparator<Article> {

	public int compare(Article arg0, Article arg1) {
		return arg0.getMarque().compareTo(arg1.getMarque());
	}

}
