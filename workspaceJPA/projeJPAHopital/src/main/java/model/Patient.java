package model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Patient {

	private int id;
	private String nom;
	private String prenom;
	private Coordonnees coord;
	private Collection<Hopital> proj;

	public Patient() {
	}

	public Patient(int i, String string) {
		// TODO Auto-generated constructor stub
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

	@ManyToMany(mappedBy="patient", fetch = FetchType.LAZY)
	public Collection<Hopital> getHopital() {
		return proj;
	}

	public void setHopital(Collection<Hopital> col2) {
		this.proj = col2;
	}

	@Embedded
	public Coordonnees getCoord() {
		return coord;
	}

	public void setCoord(Coordonnees coord) {
		this.coord = coord;
	}

	
}