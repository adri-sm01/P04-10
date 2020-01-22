package testTest;


import static org.junit.Assert.*;

import org.junit.Test;

public class OperadorAritmeticoTest {

	@Test
	public void testSuma() {

		 int esperado=8;
		 int a = 5;
		 int b = 3;
		 int suma = OperadorAritmetico.suma(a, b);

		 assertEquals(esperado, suma);
	} 
	
	@Test
	public void testSumaNegativo() {

		 int esperado= -8;
		 int a = -5;
		 int b = -3;
		 int suma = OperadorAritmetico.suma(a, b);

		 assertEquals(esperado, suma);
	} 

	@Test
	public void testDivision() {
		
		int esperado=2;
		int a = 8;
		int b = 4;
		int division;
		try {
		 division = OperadorAritmetico.division(a, b);
		 assertEquals(esperado, division);
		} catch (Exception e) {
		}
		
	}

	@Test
	public void divisionPorCero() {
		int a = 8;
		int b = 0;
		int division;
		try {
			division = OperadorAritmetico.division(a, b);
			fail("Debería haber entrado al catch");
		} catch (Exception e) {
			assertTrue(true);
		}
	}
	
	@Test
	public void testConstructor() {
	  new OperadorAritmetico();
	  assertTrue(true);
	}
	
}
