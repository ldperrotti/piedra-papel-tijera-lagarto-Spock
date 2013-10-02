package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	private Forma forma;

	/**
	 * Toda Mano debe crearse con una forma dada, que será la que determine su
	 * condición en el juego.
	 * 
	 * @param forma
	 *            , la Forma que adopta la Mano.
	 */

	/*
	 * public Mano(final Forma forma) { throw new
	 * RuntimeException("No implementado aún"); }
	 */

	public Mano(final Forma forma) {
		this.forma=forma;
	}

	/**
	 * Evaluará el resultado de la partida según las reglas del juego.
	 * 
	 * @param otra
	 *            , la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */

	public Resultado jugarCon(final Mano otra) {

		int piedra=0;
		int spock=1;
		int papel=2;
		int lagarto=3;
		int tijera=4;
		
		Resultado matriz[][]=new Resultado[5][5];
		matriz[piedra][piedra]=matriz[spock][spock]=matriz[papel][papel]=matriz[lagarto][lagarto]=matriz[tijera][tijera]=Resultado.EMPATA;
		matriz[piedra][lagarto]=matriz[piedra][tijera]=matriz[spock][piedra]=matriz[spock][tijera]=matriz[papel][piedra]=matriz[papel][spock]=matriz[lagarto][spock]=matriz[lagarto][papel]=matriz[tijera][papel]=matriz[tijera][lagarto]=Resultado.GANA;
		matriz[piedra][spock]=matriz[piedra][papel]=matriz[spock][papel]=matriz[spock][lagarto]=matriz[papel][lagarto]=matriz[papel][tijera]=matriz[lagarto][piedra]=matriz[lagarto][tijera]=matriz[tijera][piedra]=matriz[tijera][spock]=Resultado.PIERDE;

		return matriz[this.forma.getValor()][otra.forma.getValor()];
	}

	/*
	 * public Resultado jugarCon(final Mano otra) { throw new
	 * RuntimeException("No implementado aún"); }
	 */

}