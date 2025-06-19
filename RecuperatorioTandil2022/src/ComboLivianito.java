
public class ComboLivianito extends Combo {

	public ComboLivianito(double descuento, Condicion cond) {
		super(descuento, cond);
		// TODO Auto-generated constructor stub
	}

	public int getPrecio() {
		int suma=super.getTotalPrecio();
		Producto menorPeso = this.menorPeso();
		int livianito= menorPeso.getPrecio();
		return suma-livianito;
	}
}
