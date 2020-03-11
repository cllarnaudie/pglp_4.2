package main.java;

public class SaisieRPN {

	java.util.Scanner scanner; 
	MoteurRPN moteur; 
	
	public SaisieRPN() {
		scanner = new java.util.Scanner (System.in); 
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

