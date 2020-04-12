package test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.java.MoteurRPN;

public class TestMoteurRPN {
	
	@Test
	public final void testAddition() {
		System.out.println("\ntestAddition ");
		MoteurRPN mot = MoteurRPN.getInstance();
		int d1 = 10;
		int d2 = 20; 
		int res; 
		res = mot.addition(d1, d2);
	
		assertEquals(30, res);
		System.out.println("Le resultat de l'addition est " + res); 
	}
	
	
	@Test
	public final void testSoustraction() {
		System.out.println("\ntestSoustraction ");
		MoteurRPN mot = MoteurRPN.getInstance();
		int d1 = 20;
		int d2 = 10; 
		int res; 
		res = mot.soustraction(d1,d2);
	
		assertEquals(10, res);
		System.out.println("Le resultat de la soustraction est " + res); 
	}
	
	@Test
	public final void testMultiplication() {
		System.out.println("\ntestMultiplication ");
		MoteurRPN mot = MoteurRPN.getInstance();
		int d1 = 20;
		int d2 = 10; 
		int res; 
		res = mot.multiplication(d1, d2);
		assertEquals(200, res);
		System.out.println ("Le resultat de la multiplication est " + res); 
	}
	
	@Test
	public final void testDivision() {
		System.out.println("\ntestDivision ");
		MoteurRPN mot = MoteurRPN.getInstance();
		int d1 = 20;
		int d2 = 10; 
		int res; 
		res = mot.division(d1, d2);
		assertEquals(2, res);
		System.out.println ("Le resultat de la division est " + res); 
	}
	
	@Test
	public final void testEnregistreOperande() {
		System.out.println("\ntestEnregistreOperande ");
		MoteurRPN mot = MoteurRPN.getInstance();
		mot.enregistreOperande(10);
		mot.enregistreOperande(20);
		mot.enregistreOperande(-3);	
	}
	
	
	@Test
	public final void testAppliqueOperation() {
		System.out.println ("\ntestAppliqueOperation ");
		MoteurRPN mot = MoteurRPN.getInstance();
		mot.enregistreOperande(50);
		mot.enregistreOperande(4);
		mot.appliqueOperation("+");
		}
		
}
