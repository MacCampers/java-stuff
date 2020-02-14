package model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personne {

	private int id, age, version;
	private String nom, prenom;
	private Adresse adresse;

	public Personne() {
	}

	/**
	 * @param id
	 * @param age
	 * @param version
	 * @param nom
	 * @param prenom
	 * @param adresse
	 */
	public Personne(int id, int age, int version, String nom, String prenom, Adresse adresse) {
		super();
		this.id = id;
		this.age = age;
		this.version = version;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	@Embedded
	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
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
