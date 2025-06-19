package FabricaMuebles;

public class Producto {
	int peso;
	double costoFabricacion;
	int venta;
	String tipoProducto;
	String tipoMadera;
	String color;
	int porcentajeCosto;
	public Producto(int peso, double costoFabricacion, String tipoMadera, String color,
			int porcentajeCosto, String tipoProducto) {
		this.peso = peso;
		this.costoFabricacion = costoFabricacion;
		this.tipoMadera = tipoMadera;
		this.color = color;
		this.porcentajeCosto = porcentajeCosto;
		this.tipoProducto = tipoProducto;
	}
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public String getTipoMadera() {
		return tipoMadera;
	}
	public void setTipoMadera(String tipoMadera) {
		this.tipoMadera = tipoMadera;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPorcentajeCosto() {
		return porcentajeCosto;
	}
	public void setPorcentajeCosto(int porcentajeCosto) {
		this.porcentajeCosto = porcentajeCosto;
	}
	public double getCostoFabricacion() {
		return costoFabricacion;
	}
	public double getVenta() {
		double porcentaje= this.getPorcentajeCosto()*this.getCostoFabricacion()/100;
		return this.getCostoFabricacion() + porcentaje;
	}
	
	
}
