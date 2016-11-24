package net.andreu.OnEsEnWally;

public class Posicio {

	private int fila;
	private int columne;
	
	public Posicio(int fila, int columne) {
		super();
		this.fila = fila;
		this.columne = columne;
	}

	@Override
	public String toString() {
		return "En Wally esta a la fila: " + fila + ", i a la columne: " + columne;
	}
}
