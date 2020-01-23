package projectException;

public class Traitement {
	public static int div(int a, int b) {
		if (b == 0) {
			ArithmeticException x = new ArithmeticException("dans div()");
			throw x;
		}
		return a / b;
	}

	public static int div2(int a, int b) throws Exception {
		if (b == 0) {
			Exception x = new Exception("Dans div2()");
			throw x;
		}
		return a / b;
	}
	
	public static int calcul(int a, int b) {
		if (b == 0) {
			ArithmeticException x = new ArithmeticException("Dans calcul()");
		}
		return a / b;
	}
	
	public static int multiple(int a, int b) throws Exception {
		String str = "probleme dans mult avec un 0";
		if (a == 0)
			throw new MultException(str, "a");
		else if (b == 0) 
			throw new MultException(str, "b");
		return a * b;
	}
}

