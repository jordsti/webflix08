package ca.etsmtl.log660.entity;

public class Role extends Personne {
	private int id;
	private String nomRole;

	public String getNomRole() {
		return nomRole;
	}

	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
