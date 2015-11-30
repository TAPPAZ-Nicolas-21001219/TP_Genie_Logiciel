package Genie_Logiciel._Builder;

import java.util.ArrayList;
import java.util.Iterator;

public class Groupe implements Element{

	public ArrayList<Element> listeElements ;
	public String nom ;
	

	public void affiche()
	{
		Iterator<Element> monIte = listeElements.iterator() ;
		
		while(monIte.hasNext())
		{
			Element groupeCourant = monIte.next() ;
			
			groupeCourant.affiche();
		}
		
	}
	
Groupe(String nom, ArrayList listeElements){
		
		this.nom = nom ;
		this.listeElements = new ArrayList(listeElements) ;
	}
}
