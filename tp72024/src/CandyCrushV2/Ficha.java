package CandyCrushV2;

public class Ficha {
	private String nombreFicha;
	private int fortaleza;
	private int espacioOcupado;
	private int poderDestrucción;
	public Ficha(String nombreFicha, int fortaleza, int espacioOcupado, int poderDestrucción) {
		super();
		this.nombreFicha = nombreFicha;
		this.fortaleza = fortaleza;
		this.espacioOcupado = espacioOcupado;
		this.poderDestrucción = poderDestrucción;
	}
	public String getNombreFicha() {
		return nombreFicha;
	}
	public void setNombreFicha(String nombreFicha) {
		this.nombreFicha = nombreFicha;
	}
	public int getFortaleza() {
		return fortaleza;
	}
	public void setFortaleza(int fortaleza) {
		this.fortaleza = fortaleza;
	}
	public int getEspacioOcupado() {
		return espacioOcupado;
	}
	public void setEspacioOcupado(int espacioOcupado) {
		this.espacioOcupado = espacioOcupado;
	}
	public int getPoderDestrucción() {
		return poderDestrucción;
	}
	public void setPoderDestrucción(int poderDestrucción) {
		this.poderDestrucción = poderDestrucción;
	}
	
	
	public String toString() {
		return "Nombre" + ": " + " " + this.getNombreFicha() + "\n" + 
				"Fortaleza" + ": " + " " + this.getFortaleza() + "\n" +
				"Espacio Ocupado" + ": " + " " + this.getEspacioOcupado() + "\n" +
				"Poder" + ": " + " " + this.getPoderDestrucción() + "]" + "\n";

	}
	
}
