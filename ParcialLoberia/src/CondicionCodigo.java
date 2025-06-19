
public class CondicionCodigo extends Condicion {
	int valor;
	
	
	public CondicionCodigo(int valor) {
		super();
		this.valor = valor;
	}


	@Override
	public boolean cumple(Elemento el) {
		return el.getCodigoIdentificado()==valor;
	}

}
