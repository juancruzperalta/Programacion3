
public class ElementoEnvejecimientoProgramado extends ElementoAbstracto {
	private ElementoAbstracto elemento;
	private int mesesAntiguedad;
	private double porcentaje;
	



	public ElementoEnvejecimientoProgramado(int codigoIdentificacion, ElementoAbstracto elemento, int mesesAntiguedad,
			double porcentaje) {
		super(codigoIdentificacion);
		this.elemento = elemento;
		this.mesesAntiguedad = mesesAntiguedad;
		this.porcentaje = porcentaje;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public ElementoAbstracto getElemento() {
		return elemento;
	}

	public void setElemento(ElementoAbstracto elemento) {
		this.elemento = elemento;
	}
	

	public int getMesesAntiguedad() {
		return mesesAntiguedad;
	}

	public void setMesesAntiguedad(int mesesAntiguedad) {
		this.mesesAntiguedad = mesesAntiguedad;
	}

	@Override
	public int getValor() {
		int suma=0;
		int valor = elemento.getValor();
		if(this.getAntiguedad() < mesesAntiguedad) {
			suma = valor;
		}
		return suma;
		
	}

	@Override
	public int getAntiguedad() {
		return elemento.getAntiguedad();
		}

	@Override
	public double montoCobrado() {
		double suma= elemento.montoCobrado();
		if(elemento.getAntiguedad() < mesesAntiguedad) {
			
		return suma*porcentaje;
		}
		return suma;
	}

}
