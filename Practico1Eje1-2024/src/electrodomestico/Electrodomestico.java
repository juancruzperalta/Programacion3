package electrodomestico;

public class Electrodomestico {
	String nombre;
	int precioBase;
	String color;
	int consumoE;
	int peso;
	int pocoConsumo;

	public Electrodomestico() {
		this.color = "gris plata";
		this.consumoE = 10;
		this.precioBase = 100;
		this.peso = 2;
		this.pocoConsumo = 45;
	}
	public Electrodomestico(int consumoE) {
		this.setConsumoE(consumoE);
	}
	public Electrodomestico(int precioBase, String color) {
		this.setPrecioBase(precioBase);
		this.setColor(color);
	}
	public Electrodomestico(int preciobase, String color, int peso, int consumoE) {
		this.setConsumoE(consumoE);
		this.setColor(color);
		this.setPrecioBase(preciobase);
		this.setPeso(peso);
	}
	
	public boolean esBajoConsumo() {
		return this.getConsumoE() < this.pocoConsumo;
	}
	public int balance() {
		return this.getPrecioBase() / this.getPeso();
	}
	public boolean esAltaGama() {
		if(this.balance() > 3) {
			return true;
		}
		return false;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getConsumoE() {
		return consumoE;
	}

	public void setConsumoE(int consumoE) {
		this.consumoE = consumoE;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}