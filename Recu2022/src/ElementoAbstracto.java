
public abstract class ElementoAbstracto {
	private int codigo;

	public ElementoAbstracto(int codigo) {
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
	public abstract int getAntiguedad();
	public abstract double getCosto();
	
	public boolean equals(Object o1) {
		ElementoAbstracto e1 = (ElementoAbstracto)o1;
		return e1.getCodigo() == this.getCodigo();
	}
}
