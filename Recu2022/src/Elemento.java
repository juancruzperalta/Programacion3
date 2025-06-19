
public class Elemento extends ElementoAbstracto {
	private int valor;
	private int antiguedad;
	private String descripcion;
	private CalcularMonto cc;
	
	

	
	
	public Elemento(int codigo, int valor, int antiguedad, String descripcion, CalcularMonto cc) {
		super(codigo);
		this.valor = valor;
		this.antiguedad = antiguedad;
		this.descripcion = descripcion;
		this.cc = cc;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}


	@Override
	public int getValor() {
		return this.valor;
	}

	@Override
	public int getAntiguedad() {
		return this.antiguedad;
	}


	@Override
	public double getCosto() {
		return cc.calcularMonto(this);
	}

}
