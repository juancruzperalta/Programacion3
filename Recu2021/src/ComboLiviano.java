
public class ComboLiviano extends Combo{

	public ComboLiviano(double descuento, Condicion cond) {
		super(descuento, cond);
		// TODO Auto-generated constructor stub
	}
	public int getPrecio() {
		int suma = super.getPrecioTotal();
		Producto menorPeso = super.menorPeso();
		int valor = menorPeso.getPrecio();
		return suma-valor;
	}
}
