package projmanven1;

public class Articles {
	private String marque;
	private int prix;
	private String code;

	public Articles(String marque, int prix, String code) {
		this.marque = marque;
		this.prix = prix;
		this.code = code;
	}

	@Override
	public String toString() {
		return "Articles [marque=" + marque + ", prix=" + prix + "n code=" + code +"]";
	}

}
