
public abstract class ElementoAlquiler {
	private int codigo;

	public ElementoAlquiler(int codigo) {
		super();
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public abstract int getValor();
	public abstract int antiguedad();
	
	public abstract double calcularCosto();
	
	
	public boolean equals(Object o1) {
		ElementoAlquiler e1 = (ElementoAlquiler)o1;
		return e1.codigo == this.codigo;
	}
}
