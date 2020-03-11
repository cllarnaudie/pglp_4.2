package main.java;
import java.util.ArrayList; 
//import java.util.Stack;


public class Interpreteur {
	protected ArrayList<Double>pile;
	//protected Stack<Double> pile;  
	
	public Interpreteur() {
		pile = new ArrayList<Double>(); 
	}

public void undo() {
	pile.remove(pile.size());
	
}

public void quit() {
	System.exit(0);
}

}
