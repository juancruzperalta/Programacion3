
public class Elemento extends ElementoAlquiler {
	private int valor;
	private int antiguedad;
	private String descripcion;
	private CalcularCosto cc;
	
	


	public Elemento(int codigo, int valor, int antiguedad, String descripcion, CalcularCosto cc) {
		super(codigo);
		this.valor = valor;
		this.antiguedad = antiguedad;
		this.descripcion = descripcion;
		this.cc = cc;
	}


	public CalcularCosto getCc() {
		return cc;
	}


	public void setCc(CalcularCosto cc) {
		this.cc = cc;
	}


	public int getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
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


	@Override
	public int getValor() {
		return this.valor;
	}

	@Override
	public int antiguedad() {
		return this.antiguedad;
	}


	@Override
	public double calcularCosto() {
		return cc.calcularCosto(this);
	}

}
