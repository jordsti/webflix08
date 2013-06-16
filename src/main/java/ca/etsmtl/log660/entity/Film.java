package ca.etsmtl.log660.entity;

import java.util.Set;

import ca.etsmtl.log660.entity.Role;


public class Film {
	private int id;
	private String titre;
	private int annee;
	private String resume;
	private String poster;
	private int duree;
	private Set<Role> roles;
	private Set<Pays> pays;
	private Set<Genre> genres;
	private Set<Scenariste> scenaristes;
	private Set<Annonce> annonces;
	private Langue langue;
	private Personne realisateur;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	public Set<Pays> getPays() {
		return pays;
	}
	public void setPays(Set<Pays> pays) {
		this.pays = pays;
	}
	public Set<Genre> getGenres() {
		return genres;
	}
	public void setGenres(Set<Genre> genres) {
		this.genres = genres;
	}
	public Set<Scenariste> getScenaristes() {
		return scenaristes;
	}
	public void setScenaristes(Set<Scenariste> scenaristes) {
		this.scenaristes = scenaristes;
	}
	public Set<Annonce> getAnnonces() {
		return annonces;
	}
	public void setAnnonces(Set<Annonce> annonces) {
		this.annonces = annonces;
	}
	public Langue getLangue() {
		return langue;
	}
	public void setLangue(Langue langue) {
		this.langue = langue;
	}
	public Personne getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(Personne realisateur) {
		this.realisateur = realisateur;
	}
}
