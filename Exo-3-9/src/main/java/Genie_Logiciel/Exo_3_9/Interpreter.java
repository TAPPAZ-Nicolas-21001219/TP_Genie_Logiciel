package Genie_Logiciel.Exo_3_9;

import java.util.Hashtable;
import java.util.Stack;

public class Interpreter {
	
protected Stack <String> history = new Stack<String> ( ) ;
protected Hashtable <String, Command> set = new Hashtable<String, Command> ( ) ;

public void session ( ) {
while ( true ) {
Command command = getNewCommand( ) ;
if (command instanceof Quit) {
return ;
}
command.execute( ) ;

}
}
protected Command getNewCommand ( ) {
String s = System.in.toString( ) ;
while ( !set.containsKey(s) ) {
System.err.println("Commande non valide, veuillez réessayer.") ;
s = System.in.toString ( ) ;
}
return ((Command)set.get(s)) ;
}
}