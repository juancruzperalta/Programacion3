package tp3ejerc2;

import java.util.ArrayList;

public class fabrica {
	private ArrayList<productos> prod;
	private double valorVenta;
	
	public fabrica(double valorVenta) {
		this.valorVenta = valorVenta;
	prod = new ArrayList<productos>();
	}
	
	public void addProducto(productos p) {
		prod.add(p);
	}
	public productos productosEnStock() {
		for(int i=0; i<prod.size(); i++) {
			productos pd = prod.get(i);
			if(pd != null) {
				return pd;
			}
		}
		return null;
	}
	public double getCoste(productos p) {
		double pp = p.getCoste()*valorVenta;
		return p.getCoste()+pp;
	}
}
//Una fábrica de muebles desea organizar su manufactura de manera electrónica. La
//fábrica solo produce sillas, mesas y bancos. Se debe poder calcular el costo de
//todos los productos en stock, ya sea precio de fabricación o precio de venta. El precio
//de Venta es el precio de costo más un 35%
//Consejo: Analizar Clase Vs Instancia
//Extra: ¿Qué sucede si se agrega un producto cuyo precio de venta es el 10% más del
//costo de fabricación?
