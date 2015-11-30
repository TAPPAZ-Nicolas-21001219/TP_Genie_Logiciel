package Genie_Logiciel._Serializable;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class GroupeTest {

	@Before
	public void testEcrire() throws FileNotFoundException, ClassNotFoundException, IOException {
		//Teste egalement la lecture.
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
		Groupe monGroupe2 = new Groupe("Groupe2", maListe) ;
		monGroupe.ecrire();
		monGroupe2.lire();
		
		assert(monGroupe.nom == monGroupe2.nom) ;
	}
}
