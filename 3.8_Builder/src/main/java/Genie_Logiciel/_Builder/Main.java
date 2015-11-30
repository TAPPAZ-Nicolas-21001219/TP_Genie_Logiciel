package Genie_Logiciel._Builder;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args){
		
		ArrayList<Long> mesNumeros = new ArrayList();
		mesNumeros.add((long) 34593779) ;
		
		Personnel Marcel = new Personnel.Builder("Marcel", "Durand", LocalDate.now(), mesNumeros).build() ;
		Personnel Jacky = new Personnel.Builder("Jacky", "Daniel", LocalDate.now(), mesNumeros).build() ;
		Personnel Rene = new Personnel.Builder("René", "Chombier", LocalDate.now(), mesNumeros).build() ;
		
		ArrayList<Element> maListe = new ArrayList<Element>() ;
		maListe.add(Marcel) ;
		maListe.add(Jacky) ;
		maListe.add(Rene) ;
		
		Groupe monGroupe = new Groupe("GroupeAJacky", maListe) ;
				
		System.out.println("Le groupe est " + monGroupe.nom) ;
						
		monGroupe.nom = "GroupeAMichel" ;
				
		System.out.println(monGroupe.nom) ;
		
	}

}
