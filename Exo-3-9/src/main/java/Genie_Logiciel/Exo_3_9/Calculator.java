package Genie_Logiciel.Exo_3_9;

class Calculator extends Interpreter {
Calculator ( ) {
set.put("quit", new Quit ( ) ) ;
set.put("undo", new Undo(history) ) ;
set.put("plus", new Plus(history) ) ;
set.put("min", new Min(history) ) ;
set.put("mul", new Mul(history) ) ;
set.put("div", new Div(history) ) ;
set.put("@accept", new Accept(history) ) ;
}
protected Command getNewCommand ( ) {
String s = System.in.toString ( ) ;
while ( !set.containsKey(s) ) {
System.err.println("Commande non valide. Veuillez réessayer.") ;
s = System.in.toString ( ) ;
}
return ((Command) set.get(s)) ;
}
}