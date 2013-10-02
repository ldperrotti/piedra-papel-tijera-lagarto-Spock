package edu.tallerweb.pptls;

public class Mano {

	private Forma forma;

	public Mano(final Forma forma) {
		this.forma=forma;
	}

	public Resultado jugarCon(final Mano otra) {

		int piedra=0;
		int spock=1;
		int papel=2;
		int lagarto=3;
		int tijera=4;
		int tamano=5;
		
		Resultado matriz[][]=new Resultado[tamano][tamano];
		matriz[piedra][piedra]=matriz[spock][spock]=matriz[papel][papel]=matriz[lagarto][lagarto]=matriz[tijera][tijera]=Resultado.EMPATA;
		matriz[piedra][lagarto]=matriz[piedra][tijera]=matriz[spock][piedra]=matriz[spock][tijera]=matriz[papel][piedra]=matriz[papel][spock]=matriz[lagarto][spock]=matriz[lagarto][papel]=matriz[tijera][papel]=matriz[tijera][lagarto]=Resultado.GANA;
		matriz[piedra][spock]=matriz[piedra][papel]=matriz[spock][papel]=matriz[spock][lagarto]=matriz[papel][lagarto]=matriz[papel][tijera]=matriz[lagarto][piedra]=matriz[lagarto][tijera]=matriz[tijera][piedra]=matriz[tijera][spock]=Resultado.PIERDE;

		return matriz[this.forma.getValor()][otra.forma.getValor()];
	}
}