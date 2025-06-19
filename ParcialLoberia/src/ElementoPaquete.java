import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoPaquete {
	private int codigoIdentificado;

	public ElementoPaquete(int codigoIdentificado) {
		super();
		this.codigoIdentificado = codigoIdentificado;
	}

	public int getCodigoIdentificado() {
		return codigoIdentificado;
	}

	public void setCodigoIdentificado(int codigoIdentificado) {
		this.codigoIdentificado = codigoIdentificado;
	}
	
	public abstract int getValor();
	public abstract int antiguedad();
	
	public abstract ArrayList<Elemento> buscar(Condicion cond, Comparator<Elemento> orden);
}
