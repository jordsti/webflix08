package ca.etsmtl.log660.entity;

import java.io.Serializable;

public class Adresse  implements Serializable {
	
	private int id; 
	
	private String rue;
	private String nocivique;
	private String app;
	private String ville;
	private String province;
	private String codePostal;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getNocivique() {
		return nocivique;
	}
	public void setNocivique(String nocivique) {
		this.nocivique = nocivique;
	}
	public String getApp() {
		return app;
	}
	public void setApp(String app) {
		this.app = app;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
}
