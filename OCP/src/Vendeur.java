
public class Vendeur extends Employe {
	private int commission;
	
	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	Vendeur(String nom, String adresse, int nbAnnee,int commission) {
		super(nom, adresse, nbAnnee);
		this.commission=commission;
	}
	
	public double calculSalaireVendeur() {return calculSalaire()+commission;}

	
	


}
