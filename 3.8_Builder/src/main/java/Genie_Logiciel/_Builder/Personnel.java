package Genie_Logiciel._Builder;

import java.time.LocalDate;
import java.util.ArrayList;

public class Personnel {
	
	private final String nom ;
	private final String prenom ;
	private final LocalDate  dateDeNaissance ;
	private final ArrayList<Long> numero;
	
	
	
	public static class Builder{

	private final String nom ;
	private final String prenom ;
	private final LocalDate  dateDeNaissance ;
	private ArrayList<Long> numero;
		
	public Builder(String nom, String prenom, LocalDate dateDeNaissance, ArrayList<Long> numero)
	{
		this.nom = nom ;
		this.prenom = prenom ;
		this.dateDeNaissance = dateDeNaissance ;
		this.numero = new ArrayList(numero) ;
	}
	

	public Personnel build() {
		return new Personnel(this);
	}
	
	
	}
	
	private Personnel(Builder builder) {

		nom = builder.nom;
		prenom = builder.prenom;
		dateDeNaissance = builder.dateDeNaissance ;
		numero = builder.numero ;

	}
	
	public static void main(String args[]) {
		ArrayList<Long> mesNumeros = new ArrayList();
		mesNumeros.add((long) 34593779) ;
		
			Personnel monPersonnel = new Personnel.Builder("azertyu", "qsdfghj", LocalDate.now(), mesNumeros).build();
			System.out.println(monPersonnel.nom) ;
			System.out.println(monPersonnel.prenom) ;
			System.out.println(monPersonnel.numero.toString()) ;
			System.out.println(monPersonnel.dateDeNaissance.toString()) ;
	}
}
