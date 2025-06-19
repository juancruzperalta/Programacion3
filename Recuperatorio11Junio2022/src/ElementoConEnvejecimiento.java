
public class ElementoConEnvejecimiento extends ElementoAlquiler {
	private ElementoAlquiler elemQueApunto;
	private int mesesAntiguedad;
	private int porcentaje;
	
	
	
	

	public ElementoConEnvejecimiento(int codigo, ElementoAlquiler elemQueApunto, int mesesAntiguedad, int porcentaje) {
		super(codigo);
		this.elemQueApunto = elemQueApunto;
		this.mesesAntiguedad = mesesAntiguedad;
		this.porcentaje = porcentaje;
	}

	@Override
	public int getValor() {
		int suma=0;
		if(this.antiguedad() < mesesAntiguedad) {
			suma = elemQueApunto.getValor();
		}else {
			suma= suma/2;
		}
		return suma;
	}

	@Override
	public int antiguedad() {
		return elemQueApunto.antiguedad();
	}

	@Override
	public double calcularCosto() {
		int suma = (int) elemQueApunto.calcularCosto();
		if(elemQueApunto.antiguedad() > this.mesesAntiguedad) {
			return suma*porcentaje;
		}
		return suma;
	}

}
