package fr.uvsq.coo.ex3_5.fr.uvsq.coo;

public class Direction {
	 private  static String dir []= {"Nord","Sud","Est","Ouest"};
	 private int mydir ;
	/* public  static Direction est;  On peut remplacer les differentes directions */

	public String[] getDir() {
		return dir;
	}

	public int getMydir() {
		return mydir;
	}

	public void setMydir(int mydir) {
		this.mydir = mydir;
	}
	

}
