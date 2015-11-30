package Genie_Logiciel._Serializable;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

public class Personnel implements Element{
	
	private final String nom ;
	private final String prenom ;
	private final LocalDate  dateDeNaissance ;
	private final ArrayList<Long> numero;
	
	
	public void affiche()
	{
		System.out.println(nom) ;
	}
	
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
	
	public void ecrire() {
	try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("/home/user/Bureau/Personnel.txt")))){
						
						out.writeObject(nom);
						out.writeObject(prenom);
						out.writeObject(dateDeNaissance);
						for(int i = 0 ; i < numero.size() ; i++)
							{
									out.writeObject(numero.get(i));
							}
				
	} catch(IOException e) {}
	}

	
	public void lire() throws FileNotFoundException, IOException, ClassNotFoundException{
		try ( ObjectInputStream in = new ObjectInputStream (
				new BufferedInputStream (
				new FileInputStream ("/home/user/Bureau/Personnel.txt")))) {
				String nom2 = in.readUTF() ;
				String prenom2 = in.readUTF() ;
				LocalDate date2 = (LocalDate) in.readObject() ;
				int saTaille2 = in.readInt() ;
				
				ArrayList<Long> numero2 = new ArrayList();
				
				for(int i = 0 ; i < saTaille2 ; i++)
				{
					numero2.add((long) in.readObject());
				}
				
				}
	}
}
