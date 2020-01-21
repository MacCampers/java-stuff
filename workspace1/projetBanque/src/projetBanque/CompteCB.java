package projetBanque;

public class CompteCB extends CompteSimple {
	private CB cb;
	private int solde;

	public CompteCB(String nom, int solde, CB cb) {
		super(nom, solde);
		this.cb = cb;
		this.solde -= cb.getNum();
	}
	
	public CompteCB(String nom, CB cb) {
		super(nom);
		this.cb = cb;
		this.solde -= cb.getNum();
	}

	public String toString() {
		return "CompteCB [cb=" + cb + "]" + super.toString();
	}
	
	
}
