package main.java;
import java.util.ArrayList; 


public class Interpreteur {
	private ArrayList<Double>pile;

public void undo() {
	pile.remove(pile.size());
	
}

public void quit() {
	System.exit(0);
}

}
