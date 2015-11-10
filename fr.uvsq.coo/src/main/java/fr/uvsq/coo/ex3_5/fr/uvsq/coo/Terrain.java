package fr.uvsq.coo.ex3_5.fr.uvsq.coo;

import java.util.ArrayList;

public class Terrain {
	 private ArrayList<RobotGeneral> listRobot = new ArrayList<RobotGeneral>();
	 
	 public void avancerTous()
	 {
		 for(int i =0; i< this.listRobot.size();i++)
		 {
			 this.listRobot.get(i).avance();
		 }
	
	 }
	 
	 public void ajouterRobot(Robot e)
	 {
		 this.listRobot.add(e);
	 }
	 
	 public void retirerRobot(Robot e)
	 {
		  this.listRobot.remove(e);
		
	 }

	public ArrayList<RobotGeneral> getListRobot() {
		return listRobot;
	}

	public void setListRobot(ArrayList<RobotGeneral> listRobot) {
		this.listRobot = listRobot;
	}
	
	
	public static void main()
	{	
	}

}
