
public class Employe {

	private final String nom ;
	private final String adresse ;
	private  int nbAnnee;
	
	public int getNbAnnee() {
		return nbAnnee;
	}

	public void setNbAnnee(int nbAnnee) {
		this.nbAnnee = nbAnnee;
	}

	Employe(String nom,String adresse,int nbAnnee)
	{
		this.nom=nom;
		this.adresse=adresse;
		this.nbAnnee = nbAnnee;
	}
	
	public double calculSalaire() {return 1500+20*nbAnnee;}


	public String getNom() {
		return nom;
	}

	public String getAdresse() {
		return adresse;
	}

}
