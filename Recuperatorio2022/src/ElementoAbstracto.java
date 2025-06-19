
public abstract class ElementoAbstracto {
	
	private int codigoIdentificacion;
	
	public ElementoAbstracto(int codigoIdentificacion) {
		super();
		this.codigoIdentificacion = codigoIdentificacion;
	}
	
	public int getCodigoIdentificacion() {
		return codigoIdentificacion;
	}
	public void setCodigoIdentificacion(int codigoIdentificacion) {
		this.codigoIdentificacion = codigoIdentificacion;
	}
	public abstract int getValor();
	public abstract int getAntiguedad();
	public abstract double montoCobrado();
}
