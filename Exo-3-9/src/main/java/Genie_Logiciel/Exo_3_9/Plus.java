package Genie_Logiciel.Exo_3_9;

import java.util.Stack;

public class Plus extends Command{
	
	protected Stack <String> history ;
	
	protected Plus(Stack <String> h)
	{
		history = h ;
	}
	
	public Stack<String> execute()
	{
		return history ;
	}

}
