
public class ComboLiviano extends Combo {

	public ComboLiviano(double desc, Condicion cond) {
		super(desc, cond);
	}

	public int precio() {
		int suma=this.totalPrecio();
		Producto menorPeso = this.menorPeso();
		int precioMenorPeso = menorPeso.getPrecio();
		return suma-precioMenorPeso;
	}
}
