
public class Manager extends Employe {
	private int nbPersonne;

	Manager(String nom, String adresse, int nbAnnee,int nbPersonne) {
		super(nom, adresse, nbAnnee);
		this.setNbPersonne(nbPersonne);
		}

	public int getNbPersonne() {
		return nbPersonne;
	}

	public void setNbPersonne(int nbPersonne) {
		this.nbPersonne = nbPersonne;
	}
	
	public double calculSalaireManager() {return calculSalaire()+nbPersonne*100;}


}
