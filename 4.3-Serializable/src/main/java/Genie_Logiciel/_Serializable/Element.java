package Genie_Logiciel._Serializable;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;

public interface Element extends Serializable{

	public void affiche();
	public void ecrire() ;
	public void lire() throws FileNotFoundException, IOException, ClassNotFoundException ;
	


}
