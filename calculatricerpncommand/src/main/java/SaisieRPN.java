package main.java;
import java.util.Scanner;

public class SaisieRPN {

	//java.util.Scanner scanner; 
	Scanner scanner; 
	MoteurRPN moteur; 
	
	public SaisieRPN() {
		//scanner = new java.util.Scanner (System.in); 
		scanner   = new Scanner (System.in); 
		moteur = new MoteurRPN(); 
	}

	public void lire_entree() {
		
		if (scanner.hasNextFloat()) {
			moteur.operation_operande (scanner.nextFloat());
		}
		else {
			moteur.operation_operateur(scanner.next());
		}
	}
}

