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
	
	public void ecrire(){
	try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("/home/user/Bureau/Test.txt")))){
						
		
						out.writeUTF(nom) ;
						out.writeInt(listeElements.size());
							for(int i = 0 ; i < listeElements.size() ; i++)
							{
								out.writeObject(listeElements.get(i));
																
							}
				} catch(IOException e){}
	}

			 
	
	public void lire() throws FileNotFoundException, IOException, ClassNotFoundException{
		try ( ObjectInputStream in = new ObjectInputStream (
				new BufferedInputStream (
				new FileInputStream ("/home/user/Bureau/Test.txt")))) {
				this.nom = (String) in.readUTF() ;
				int taille = in.readInt() ;
				try {
				for(int i = 0 ; i < taille ; i++) {
						
					listeElements.add((Element) in.readObject());
					
				}
				} catch (EOFException e) {}
				}
	}
}
