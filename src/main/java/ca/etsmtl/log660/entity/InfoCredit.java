package ca.etsmtl.log660.entity;

public class InfoCredit {
	private int id;
	private String numeroCarte;
	private String carte;
	private int expMois;
	private int expAnnee;
	private int cvv;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumeroCarte() {
		return numeroCarte;
	}
	public void setNumeroCarte(String numeroCarte) {
		this.numeroCarte = numeroCarte;
	}
	public String getCarte() {
		return carte;
	}
	public void setCarte(String carte) {
		this.carte = carte;
	}
	public int getExpMois() {
		return expMois;
	}
	public void setExpMois(int expMois) {
		this.expMois = expMois;
	}
	public int getExpAnnee() {
		return expAnnee;
	}
	public void setExpAnnee(int expAnnee) {
		this.expAnnee = expAnnee;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
}
