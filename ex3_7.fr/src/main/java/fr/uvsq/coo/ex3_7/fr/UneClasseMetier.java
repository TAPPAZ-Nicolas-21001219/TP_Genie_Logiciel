package fr.uvsq.coo.ex3_7.fr;

import java.time.LocalDateTime;

/* 1) Cette classe ne respecte pas le principe DIP  car la classe dépends de la méthode println
 * 
 * */

public class UneClasseMetier extends AfficheTous {
	
	public void uneMethodeMetier()
	{
		AfficheTous.Affiche(LocalDateTime.now()+ ": Début  de  uneMethodeMetier");
	
	
	// Traitement métiers
	
		AfficheTous.Affiche(LocalDateTime.now()+ ": Fin  de  uneMethodeMetier");

	
	}
	

}
