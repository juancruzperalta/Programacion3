import java.util.ArrayList;
import java.util.Comparator;

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
	public abstract int getAntiguedad();
	public abstract ArrayList<Elemento> buscar(Condicion cond, Comparator<Elemento> orden);
}
