package CandyCrush;

public class Ficha {
	private String nombre;
	private int fortaleza;
	private int espacioOcupa;
	private int poderDestruccion;
	
	public Ficha(String nombre, int fortaleza, int espacioOcupa, int poderDestruccion) {
		this.nombre = nombre;
		this.fortaleza = fortaleza;
		this.espacioOcupa = espacioOcupa;
		this.poderDestruccion = poderDestruccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFortaleza() {
		return fortaleza;
	}

	public void setFortaleza(int fortaleza) {
		this.fortaleza = fortaleza;
	}

	public int getEspacioOcupa() {
		return espacioOcupa;
	}

	public void setEspacioOcupa(int espacioOcupa) {
		this.espacioOcupa = espacioOcupa;
	}

	public int getPoderDestruccion() {
		return poderDestruccion;
	}

	public void setPoderDestruccion(int poderDestruccion) {
		this.poderDestruccion = poderDestruccion;
	}
	
	
	public String toString() {
		return "nombre" + " " +this.getNombre() + " " + "Espacio ocupado" + " " + this.getEspacioOcupa()
		 + " " + "Fortaleza" + " " + this.getFortaleza() + " " + "Poder Destruccion" + " " + this.getPoderDestruccion() + "\n";
	}
	

}
