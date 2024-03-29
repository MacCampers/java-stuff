package model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Computer {
	private String SN, model;
	private int version;
	private Personne personne;

	
	public Computer(String sN, String model, int version, Personne personne) {
		SN = sN;
		this.model = model;
		this.version = version;
		this.personne = personne;
	}

	public Computer() {
	}

	@Id
	public String getSN() {
		return SN;
	}

	public void setSN(String sN) {
		SN = sN;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

//	@OneToOne(mappedBy = "pc")
	@OneToOne(mappedBy = "pc", fetch=FetchType.EAGER)
	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

}
