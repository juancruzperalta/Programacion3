
public class ElementoConEnvejecimiento extends ElementoAbstracto {
	private int mesesAntiguedad;
	private ElementoAbstracto elementoQueApunto;
	private int porcentaje;
	
	
	

	public ElementoConEnvejecimiento(int codigo, int mesesAntiguedad, ElementoAbstracto elementoQueApunto,
			int porcentaje) {
		super(codigo);
		this.mesesAntiguedad = mesesAntiguedad;
		this.elementoQueApunto = elementoQueApunto;
		this.porcentaje = porcentaje;
	}



	public int getPorcentaje() {
		return porcentaje;
	}



	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}



	public int getMesesAntiguedad() {
		return mesesAntiguedad;
	}



	public void setMesesAntiguedad(int mesesAntiguedad) {
		this.mesesAntiguedad = mesesAntiguedad;
	}



	public ElementoAbstracto getElementoQueApunto() {
		return elementoQueApunto;
	}



	public void setElementoQueApunto(ElementoAbstracto elementoQueApunto) {
		this.elementoQueApunto = elementoQueApunto;
	}



	@Override
	public int getValor() {
		int suma = elementoQueApunto.getValor();
		if(this.getAntiguedad() < mesesAntiguedad) {
			return suma;
		}else {
			return suma/porcentaje;
		}
		
	}

	@Override
	public int getAntiguedad() {
		return elementoQueApunto.getAntiguedad();
	}



	@Override
	public double getCosto() {
		double monto = elementoQueApunto.getCosto();
		if(this.getAntiguedad() > mesesAntiguedad) {
			return monto*porcentaje;
		}
		return monto;
	}

}
