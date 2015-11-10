package fr.uvsq.coo.ex3_5.fr.uvsq.coo;


/* 1) On ne respecte pas le modéle LSP car 
 * si on crée une list de Robot 
 * List<Robot> listRobot = new List<Robot>();
 * PremierRobot listRobo[0]
 * PremierRobot.avance <---- lance une exception
 */

public class Robot extends RobotGeneral {
	
	
	public Robot(Position position, Direction direction) {
		super(position, direction);
	}
	public void tourne ( ) { 
		int dir = direction.getMydir();
		dir = (dir +1 ) % 4;
		direction.setMydir(dir);
	}
	
	@Override
	public void avance ( ) { 
		switch(direction.getMydir())
		{
		case 0 :position.setY(position.getY()-1);
		case 1 :position.setY(position.getY()+1);
		case 2 :position.setX(position.getX()+1);
		case 3 :position.setX(position.getX()-1);
	
		}
		
	}
	

	
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}

}
