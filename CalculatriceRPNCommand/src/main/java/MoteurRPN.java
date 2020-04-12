package main.java;
import java.util.ArrayList;

/**
 * Design pattern : command
 * @author claire
 *
 */

public class MoteurRPN implements Interpreteur {
	
	private static MoteurRPN instance; /**instance unique de la classe*/
	
	protected  static ArrayList<Integer>pile;  /**pile d operande*/
	
	/**
	 * constructeur prive
	 */
	private MoteurRPN() {
		super(); 
		pile = new ArrayList<Integer>();
		
	}
	
	/**
	 * instance de la classe
	 * @return instance
	 */
	public static MoteurRPN getInstance() {
		if (instance == null) {
			instance = new MoteurRPN(); 
		}
		return instance; 
	}

	
	@Override
	public void undo() {
		if (pile.size() > 0) {
			int indice = pile.size() - 1;
			pile.remove(indice);
			affiche_pile();
		}
		
	}
	
	@Override
	public void quit() {
		System.out.println("Fin de l'application");
		System.exit(0);	
	}
	
	/**
	 * Ajout d un operande au sommet de la pile
	 * @param op
	 */
	public void enregistreOperande(int op) {
		pile.add(op);
		affiche_pile();
	}
	
	/**
	 * Addition
	 * @param op1
	 * @param op2
	 * @return res
	 */
	public int addition(int op1, int op2) {
		int res = op1 + op2; 
	   pile.add(res); 
	   System.out.println(res);
	   return res; 
	}
	
	/**
	 * soustraction
	 * @param op1
	 * @param op2
	 * @return res
	 */
	public int soustraction(int op1, int op2) {
		int res = op1 - op2; 
	   pile.add(res); 
	   System.out.println(res);
	   return res; 
	}
	
	/**
	 * Multiplication
	 * @param op1
	 * @param op2
	 * @return res
	 */
	public int multiplication(int op1, int op2) {
		int res = op1 * op2; 
	   pile.add(res); 
	   System.out.println(res);
	   return res; 
	}
	
	/**
	 * Division
	 * @param op1
	 * @param op2
	 * @return res
	 */
	public int division(int op1, int op2) {
		int res = op1 / op2;		
		pile.add(res); 
		System.out.println(res);
		return res; 
	}
	

	/**
	 * Recherche de l operande en haut de la pile
	 * @return res
	 */
	private int pop() {
		int res = 0;
		int indice = pile.size();
		
		if (indice >= 1) {
			indice = indice - 1;
			
			res = pile.get(indice);
		
			pile.remove(indice);  /**supression de l operande*/
		}
		
		return res; 
	}
	
	/**
	 * Traitement d un operateur
	 * @param op
	 */
	public void appliqueOperation(String op) {
				
		if (op.equals("+")) {
			int op1 = pop();
			int op2 = pop();
			addition(op1, op2);
			
		}
		
		else if (op.equals("-")) {
			int op1 = pop();
			int op2 = pop();
			soustraction(op1, op2);
			
		}
		
		else if (op.equals("*")) {
			int op1 = pop();
			int op2 = pop();
			multiplication(op1, op2);
		}
		
		else if (op.equals("/")) {
			int op1 = pop();
			int op2 = pop();
			division(op1, op2);
		}
		
		else if (op.equals("undo")) {
			undo();
		}
		
		else if (op.equals("quit")) {
			quit();
		}
		
		else if (op.equals("exit")) {
			quit();
		}
		
	}
 
	/**
	 * Affiche la pile
	 */
	public void affiche_pile() {
		
		System.out.println("Pile ");
		int i; 
		if (pile.size() > 0) {
			for (i = 0; i < pile.size(); i++) {
				System.out.println(pile.get(i) + " " + " indice pile " + i); 
			}
		}

	}
		 
}
