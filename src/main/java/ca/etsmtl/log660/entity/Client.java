package ca.etsmtl.log660.entity;



public class Client extends Intervenant {	
	
	private int id;
	
	private Forfait forfait;
	
	private InfoCredit infoCredit;
	
	public Forfait getForfait() {
		return forfait;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setForfait(Forfait forfait) {
		this.forfait = forfait;
	}
	public InfoCredit getInfoCredit() {
		return infoCredit;
	}
	public void setInfoCredit(InfoCredit infoCredit) {
		this.infoCredit = infoCredit;
	}
}
