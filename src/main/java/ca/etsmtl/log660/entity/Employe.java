package ca.etsmtl.log660.entity;



public class Employe extends Intervenant {
	
	
	private int id;
	private int matricule;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
}
