package FabricaMuebles;

public class Fabrica {
	Producto[] productos;
	int stockDisponible;
	public Fabrica() {
		this.stockDisponible =0;
		productos = new Producto[100];
	}
	
	
	public void addProducto(Producto pe) {
		if(pe != null && stockDisponible < productos.length) {
			productos[stockDisponible]=pe;
			stockDisponible++;
		}
	}
	public int productosStock() {
		return stockDisponible;
	}
	
}
