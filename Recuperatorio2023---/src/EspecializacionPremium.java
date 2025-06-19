
public class EspecializacionPremium extends Especializacion {

	public EspecializacionPremium(String nombre, double descuento, Condicion cond) {
		super(nombre, descuento, cond);
		// TODO Auto-generated constructor stub
	}
	public int getPrecio() {
		return super.totalPrecioCursos();
	}
}
