package Genie_Logiciel.Exo_3_9;

import java.util.Stack;

class Undo extends Command {
protected Stack history ;
public Undo(Stack h) { history = h ; }
public Stack<String> execute ( )
{
	history.pop() ;
	return history ;
}


}