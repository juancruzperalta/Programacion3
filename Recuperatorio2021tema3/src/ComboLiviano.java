
public class ComboLiviano extends Combo {

	public ComboLiviano(double desc, Condicion cond) {
		super(desc, cond);
	}

	public double getPrecio() {
		double suma= super.totalPrecio();
		Producto menorPeso = super.menorPeso();
		double precioMenorPeso = menorPeso.getPrecio();
		return suma-precioMenorPeso;
	}
}
