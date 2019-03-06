package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {
	
	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private String addresse;
	private String numSecurite;
	private String emailPro;
	private String photo;
	private ZonedDateTime dateHeureCreation;
	private Boolean actif;
	
	/**
	 * @param matricule
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param addresse
	 * @param numSecurite
	 * @param emailPro
	 * @param photo
	 * @param dateHeureCreation
	 * @param actif
	 */
	public Collaborateur(String matricule, String nom, String prenom, LocalDate dateNaissance, String addresse,
			String numSecurite, String emailPro, String photo, ZonedDateTime dateHeureCreation, Boolean actif) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.addresse = addresse;
		this.numSecurite = numSecurite;
		this.emailPro = emailPro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
	}
	
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
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
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getAddresse() {
		return addresse;
	}
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	public String getNumSecurite() {
		return numSecurite;
	}
	public void setNumSecurite(String numSecurite) {
		this.numSecurite = numSecurite;
	}
	public String getEmailPro() {
		return emailPro;
	}
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}
	public Boolean getActif() {
		return actif;
	}
	public void setActif(Boolean actif) {
		this.actif = actif;
	}

}
