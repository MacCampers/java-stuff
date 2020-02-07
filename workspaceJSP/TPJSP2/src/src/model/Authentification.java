package src.model;

public class Authentification {
	private String nom;
	private String message;
	private String[] pers = { "titi", "toto", "dupond" };

	public Authentification(String nom) {
		this.nom = nom;
		getMessageType();
	}

	public boolean getMessageType() {
		for (String element : pers) {
			if (element == nom) {
				this.message = "OK";
				return true;
			} else
				this.message = "Erreur";
		}
		return false;
	}

	public String getMessage() {
		return message;
	}

	public String getNom() {
		return nom;
	}

}
