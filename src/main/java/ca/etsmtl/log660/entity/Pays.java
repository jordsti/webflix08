package ca.etsmtl.log660.entity;

public class Pays {
	private int id;
	private String nomPays;

	public Pays(){
	}
	
	public Pays(int id, String nomPays){
		this.id = id;
		this.nomPays = nomPays;
	}
	
	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
