
public class EspecializacionPremium extends Especializacion {

	public EspecializacionPremium(String nombre, double descuento, Condicion cond) {
		super(nombre, descuento, cond);
	}
	@Override
	public double getPrecioDeterminado() {
		return this.getPrecio();
	}
}
