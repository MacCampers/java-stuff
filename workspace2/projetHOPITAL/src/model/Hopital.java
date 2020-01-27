package model;

public class Hopital {
	private static Medecin med;
	private static Secretaire sec;

	public static String login(String login, String password, int metier) {
		if (metier == 0)
			sec = new Secretaire(login, password);
		else
			med = new Medecin(login, password, metier);
		return null;
	}
	
	
}
