package main.java;

public class MoteurRPN extends Interpreteur{
	
	public MoteurRPN() {
		super(); 
		
	}
	public void operation_operande (double op) {
		pile.add(op); 
	}
	
	public void operation_operateur() {
		
	}
 
	public void affiche_pile() {
		 int i; 
		 for (i=0; i<pile.size(); i++) {
			 System.out.println(pile.get(i) + " "); 
		 }
		 System.out.println("\n"); 
	}
	 
}
