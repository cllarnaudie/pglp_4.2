package main.java;


/** Classe principale
 * Utilisation du design pattern : Singleton
 * @author claire
 */

public class CalculatriceRPNCommand {
	
	private static CalculatriceRPNCommand instance; /*instance unique*/
	
	/**
	 * constructeur prive
	 * */
	private CalculatriceRPNCommand() { }
	
	public static CalculatriceRPNCommand getInstance () {
		if (instance == null) {
			instance = new CalculatriceRPNCommand(); 
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
		CalculatriceRPNCommand.getInstance().run(args);

	}
}
