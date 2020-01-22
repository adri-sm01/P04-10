package testTest;

import org.junit.Test;

import junit.framework.TestCase;

public class SubscripcionTest extends TestCase {
	
	@Test
	public void testprecioPorMes() {
	double esperado=100;
	Subscripcion s = new Subscripcion(200,2) ;
	double resultado = s.precioPorMes();
	assertEquals(esperado, resultado,0) ;
	}
	@Test
	public void testprecioPorMes2() {
	int esperado=67;
	Subscripcion s = new Subscripcion(200,3) ;
	int resultado= (int) s.precioPorMes();
	assertEquals(esperado, resultado, 0) ;
	}
	
	@Test
	public void testCancel() {
		Subscripcion s = new Subscripcion(0,0);
		s.cancel();
		assertTrue(true);
		
	}

}
