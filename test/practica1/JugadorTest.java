package practica1;

import static org.junit.Assert.*;

import org.junit.Test;

public class JugadorTest {

	@Test
	public void queValor1RetorneCorrectamente() {
		Jugador maradona = new Jugador(1,2,3,4);
		Integer ve=1;
		
		assertEquals(ve,maradona.getValor1());
	}

	
	@Test
	public void queValor2RetorneCorrectamente() {
		Jugador maradona = new Jugador(1,2,3,4);
		Integer ve=2;
		
		assertEquals(ve,maradona.getValor2());
	}

	@Test
	public void queValor3RetorneCorrectamente() {
		Jugador maradona = new Jugador(1,2,3,4);
		Integer ve=3;
		
		assertEquals(ve,maradona.getValor3());
	}
	
}