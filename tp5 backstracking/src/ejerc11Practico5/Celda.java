package ejerc11Practico5;

public class Celda {
	int posCelda;
	int fila,col;
	public Celda(int posCelda, int fila, int col) {
		super();
		this.posCelda = posCelda;
		this.fila = fila;
		this.col = col;
	}
	public int getPosCelda() {
		return posCelda;
	}
	public void setPosCelda(int posCelda) {
		this.posCelda = posCelda;
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	
	public String toString() {
		return this.getPosCelda() + " | " + this.getFila() + " | " + this.getCol();
	}
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Celda other = (Celda) obj;
	    return this.fila == other.fila && this.col == other.col;
	}

}
