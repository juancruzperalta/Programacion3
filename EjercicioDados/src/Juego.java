
public class Juego {
	private int puntos1, puntos2;
	private int dado1;
	private int dado2;
	private int tiradas;
	
	public Juego(int dado1, int dado2, int tiradas) {
		this.dado1 = dado1;
		this.dado2 = dado2;
		this.tiradas = tiradas;
	}
	public void jugar() {
		for(int i=0; i<tiradas; i++) {
			
		}
	}
	
	public int getPuntos1() {
		return puntos1;
	}
	public void setPuntos1(int puntos1) {
		this.puntos1 = puntos1;
	}
	public int getPuntos2() {
		return puntos2;
	}
	public void setPuntos2(int puntos2) {
		this.puntos2 = puntos2;
	}
	public int getDado1() {
		return dado1;
	}
	public void setDado1(int dado1) {
		this.dado1 = dado1;
	}
	public int getDado2() {
		return dado2;
	}
	public void setDado2(int dado2) {
		this.dado2 = dado2;
	}
	
}
