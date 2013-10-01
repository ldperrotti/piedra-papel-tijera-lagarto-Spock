package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

	@Test
	public void queTijeraCortaPapel() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Tijera Corta Papel",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void quePapelCortaTijera() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Papel Corta Tijera",
				Resultado.PIERDE, jugadorDos.jugarCon(jugadorUno));
		
	}

	
	
	/*
 * 
 */
	
	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void quePiedraEsVaporizadaPorSpock() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Piedra es Vaporizada por Spock ",
				Resultado.PIERDE, jugadorDos.jugarCon(jugadorUno));
		
	}
	
	@Test
	public void queSpockEmpataConSpock() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Spock Empata",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));
		
	}
	
	@Test
	public void queSpockEsEnvenadoPorLagarto() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Spock es envenenado por Lagarto",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));
		
	}
	
	@Test
	public void lagartoEnvenenaASpock() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Lagarto Envenena a Spock",
				Resultado.GANA, jugadorDos.jugarCon(jugadorUno));
		
	}

	@Test
	public void lagartoEmpataConLagarto() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Lagarto empata con Lagarto",
				Resultado.EMPATA, jugadorDos.jugarCon(jugadorUno));
		
	}

}
