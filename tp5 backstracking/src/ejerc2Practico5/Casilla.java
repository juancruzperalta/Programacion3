package ejerc2Practico5;

public class Casilla {
	int posValor;
	boolean izq;//oeste
	boolean der;//Este
	boolean abajo;//Sur
	boolean arriba;//Norte
	int posFila, posCol;
	public Casilla(int posValor, boolean izq, boolean der, boolean abajo, boolean arriba, int posFila, int posCol) {
		super();
		this.posValor = posValor;
		this.izq = izq;
		this.der = der;
		this.abajo = abajo;
		this.arriba = arriba;
		this.posFila = posFila;
		this.posCol = posCol;
	}
	public String toString() {
		return "Casilla(" + posFila + "," + posCol + ", valor=" + posValor + ")";
	}
	
}
