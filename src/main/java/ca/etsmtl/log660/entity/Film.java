package ca.etsmtl.log660.entity;

import java.util.ArrayList;
import ca.etsmtl.log660.entity.Role;


public class Film {
	private String titre;
	private int annee;
	private String resume;
	private String poster;
	private int duree;
	private ArrayList<Role> roles;
	private ArrayList<Pays> pays;
	private ArrayList<Genre> genres;
	private ArrayList<Scenariste> scenaristes;
	private ArrayList<Annonce> annonces;
	private Langue langue;
	private Personne realisateur;
}
