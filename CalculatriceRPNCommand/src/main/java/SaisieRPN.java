package main.java;
import java.util.Scanner;

public class SaisieRPN {

	private static SaisieRPN instance; /** instance unique*/
	private Scanner scanner; 
	private MoteurRPN moteur; 
	
	/** contructeur prive */
	
	private SaisieRPN() {
		scanner   = new Scanner (System.in); 
		moteur = MoteurRPN.getInstance(); 
	}
	
	public static SaisieRPN getInstance () {
		if (instance == null) {
			instance = new SaisieRPN(); 
		}
		return instance; 
	}

	
	/** Lit et traite la saisie */
	
	public void lire_entree() {
		/** lecture d un nombre */
		if (scanner.hasNextInt()) {
			moteur.enregistreOperande (scanner.nextInt());
		}
		/** lecture d une operation*/
		else {
			moteur.appliqueOperation(scanner.next());
		}
	}
}

