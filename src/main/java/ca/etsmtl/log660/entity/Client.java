package ca.etsmtl.log660.entity;

public class Client extends Intervenant {	
	private Forfait forfait;
	
	private InfoCredit infoCredit;
	
	public Forfait getForfait() {
		return forfait;
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
