package projecCalculException;

public class Traitement {
	public static double calcul(double op1, double op2, String operateur) {
		double resultat = 0;
		switch (operateur) {
		case "+":
		case "add":
			resultat = add(op1, op2);
			break;
		case "-":
		case "sous":
			resultat = sous(op1, op2);
			break;
		case "*":
		case "mult":
			try {
				resultat = mult(op1, op2);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/":
		case "div":
			resultat = div(op1, op2);
			break;
		}
		return resultat;
	}

	private static double sous(double a, double b) {
		return a - b;
	}

	private static double mult(double a, double b) throws Exception  {
		if (a == 0)
			throw new MultException("can't multiplie by 0", "a");
		else if (b == 0) 
			throw new MultException("can't multiplie by 0", "b");
		return a * b;
	}

	private static double div(double a, double b) {
		if (b == 0) {
			ArithmeticException x = new ArithmeticException("dans div()");
			throw x;
		}
		return a / b;
	}

	private static double add(double a, double b) {
		return a + b;
	}
}
