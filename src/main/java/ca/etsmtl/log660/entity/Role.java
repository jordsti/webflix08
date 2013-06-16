package ca.etsmtl.log660.entity;

public class Role {
	private int personneId;
	private int filmId;
	private String nomRole;
	private Personne personne;

	public int getPersonneId()
	{
		return personneId;
	}
	
	public void setPersonneId(int personneId)
	{
		this.personneId = personneId;
	}
	
	public Personne getPersonne()
	{
		return personne;
	}
	
	public void setPersonne(Personne p)
	{
		personne = p;
	}
	
	public String getNomRole() {
		return nomRole;
	}

	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}
	
	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}
	
}
