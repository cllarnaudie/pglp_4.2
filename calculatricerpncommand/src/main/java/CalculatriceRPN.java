package main.java;


/**
 * Classe principale 
 * 
 * Utilisation du design pattern : Singleton
 * @author claire
 *
 */
public class CalculatriceRPN {
	
	private static CalculatriceRPN instance; // instance unique
	
	private CalculatriceRPN() { // constructeur prive
		
	}
	
	public static CalculatriceRPN getInstance () {
		if (instance == null) {
			instance = new CalculatriceRPN(); 
		}
		return instance; 
	}

    
	public static void run (String [] args) {
		SaisieRPN saisie = SaisieRPN.getInstance();
		
		while (true) {
			saisie.lire_entree(); 	
		}
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main (String [] args) {
		CalculatriceRPN.getInstance().run(args);

	}
}
