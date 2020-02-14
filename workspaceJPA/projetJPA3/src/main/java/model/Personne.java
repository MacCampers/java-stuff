package model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Personne {

	private int id, age, version;
	private String nom, prenom;
	private Computer pc;

	public Personne() {
	}

	/**
	 * @param id
	 * @param age
	 * @param version
	 * @param nom
	 * @param prenom
	 * @param pc
	 */
	public Personne(int id, int age, int version, String nom, String prenom, Computer pc) {
		this.id = id;
		this.age = age;
		this.version = version;
		this.nom = nom;
		this.prenom = prenom;
		this.pc = pc;
	}


	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="COMPUTER_ID")
	public Computer getPc() {
		return pc;
	}

	public void setPc(Computer pc) {
		this.pc = pc;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
