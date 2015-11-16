package Genie_Logiciel._Builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Groupe implements Element{

	public ArrayList<Element> list ;
	
	public void affiche()
	{
		Iterator monIte = list.iterator() ;
		while(monIte.hasNext())
		{
			
			System.out.println(monIte.next()) ;
		}
		
	}
	
	Groupe(){
		
	}
}
