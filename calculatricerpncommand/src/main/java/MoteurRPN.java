package main.java;

public class MoteurRPN extends Interpreteur{
	
	public MoteurRPN() {
		super(); 
		
	}
	public void operation_operande (double op) {
		pile.add(op); 
	}
	
	public void addition (double op1, double op2) {
		double res = op1+op2; 
	   pile.add(res); 
	}
	
	public void soustraction (double op1, double op2) {
		double res = op1 - op2; 
	   pile.add(res); 
	}
	
	public void multiplication (double op1, double op2) {
		double res = op1 * op2; 
	   pile.add(res); 
	}
	
	public void division (double op1, double op2) {
		double res = op1 / op2; 
		   pile.add(res); 
	}
	public double pop () {
		double res = pile.get(pile.size());
		pile.remove(pile.size());
		return res; 
	}
	
	
	public void operation_operateur(String op) {
		double op1 = pop();
		double op2 = pop();
		
		switch(op){
		case "+": 
		addition(op1,op2);
		break;
		
		case "-": 
	    soustraction(op1,op2);
		break;
		
		case "*": 
		multiplication(op1,op2);
		break;
		
		case "division": 
		division(op1,op2);
		break;
		
		case "undo":
		undo(); 
		break; 
		
		case "quit":
		quit(); 
		break;
		
			
		}
		
	}
 
	public void affiche_pile() {
		 int i; 
		 for (i=0; i<pile.size(); i++) {
			 System.out.println(pile.get(i) + " "); 
		 }
		 System.out.println("\n"); 
	}
	 
}
