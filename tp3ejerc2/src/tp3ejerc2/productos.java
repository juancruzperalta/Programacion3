package tp3ejerc2;

public class productos{
	private String nombre;
	private int peso;
	private int coste;
	private int valorVenta;
	private String madera;
	private String color;
	
	public productos(String nombre, int peso, int coste, String madera, String color) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.coste = coste;
		this.madera = madera;
		this.color = color;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getCoste() {
		return coste;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	}

	public int getValorVenta() {
		return valorVenta;
	}

	public void setValorVenta(int valorVenta) {
		this.valorVenta = valorVenta;
	}

	public String getMadera() {
		return madera;
	}

	public void setMadera(String madera) {
		this.madera = madera;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
//De cada uno de los productos guarda su
//peso, su costo de fabricación, el valor de venta, el tipo de madera y el color. La fábrica
//también posee un stock de productos disponibles