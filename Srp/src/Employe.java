
public class Employe {
	
	/* 1) Cette classe ne respecte pas le principe du SRP car elle effectue 2 tache qui sont l'affichage est le calcul
	 * 2 et 3) Aucun modification se passe 
	 * 
	 */
	
	private final String nom ;
	private final String adresse ;
	
	Employe(String nom,String adresse)
	{
		this.nom=nom;
		this.adresse=adresse;
	}
	
	public double calculSalaire ( ) { return 15 ; }

	public String getNom() {
		return nom;
	}

	public String getAdresse() {
		return adresse;
	}

}
