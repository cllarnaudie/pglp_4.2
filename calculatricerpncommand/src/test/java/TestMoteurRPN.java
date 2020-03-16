package test.java;

//import static org.junit.Assert.*;


import org.junit.Test;

import main.java.MoteurRPN;

public class TestMoteurRPN {


	@Test
	public final void testAddition() {
		
		MoteurRPN mot = new MoteurRPN();
		double d1 = 10;
		double d2 = 20; 
		double res; 
		res = mot.addition(d1, d2);
	
 System.out.println ("Le resultat de l'addition est " + res); 
		
	}
	
	
	@Test
	public final void testSoustraction() {
		
		MoteurRPN mot = new MoteurRPN();
		double d1 = 20;
		double d2 = 10; 
		double res; 
		res = mot.soustraction(d1, d2);
	
 System.out.println ("Le resultat de la soustraction est " + res); 
	}
	
	@Test
	public final void testMultiplication() {
		
		MoteurRPN mot = new MoteurRPN();
		double d1 = 20;
		double d2 = 10; 
		double res; 
		res = mot.multiplication(d1, d2);
	
 System.out.println ("Le resultat de la multiplication est " + res); 
	}
	
	@Test
	public final void testDivision() {
		
		MoteurRPN mot = new MoteurRPN();
		double d1 = 20;
		double d2 = 10; 
		double res; 
		res = mot.division(d1, d2);
	
 System.out.println ("Le resultat de la division est " + res); 
	}
	
	
}
