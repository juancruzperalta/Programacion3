package tp1ejerc2;

public class Electrodomestico {
	private String nombre;
	private int precioBase;
	private String color;
	private int consumoEnergetico;
	private int peso;
	
	
	public Electrodomestico() {
		color = "gris";
		consumoEnergetico = 10;
		precioBase = 100;
		peso = 2;
	}
	public boolean bajoConsumo() {
		if(consumoEnergetico < 45) {
			return true;
		}
		return false;
	}
	public int balance() {
		return precioBase/peso;
	}
	public boolean altaGama() {
		if(balance()>3) {
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

	public String getColor() {
		return color;
	}



	public int getConsumoEnergetico() {
		return consumoEnergetico;
	}


	public int getPeso() {
		return peso;
	}
}