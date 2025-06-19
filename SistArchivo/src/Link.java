import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Link extends ElementoSA {
	private ElementoSA elemQueApunto;
	private static int tamanio=1;
	public Link(String nombre, LocalDate fecha, ElementoSA elem) {
		super("Acceso Director a" + elem, fecha);
		this.elemQueApunto = elem;
	}

	public ElementoSA getElemQueApunto() {
		return elemQueApunto;
	}

	public void setElemQueApunto(ElementoSA elemQueApunto) {
		this.elemQueApunto = elemQueApunto;
	}

	@Override
	public double getTamanio() {
		return tamanio;
	}

	@Override
	public ArrayList<Archivo> buscar(Condicion cond, Comparator<Archivo> orden) {
		return new ArrayList<>();
	}

	@Override
	public ElementoSA Copiar() {
		Link ll = new Link(this.getNombre(), this.getFechaCreacion(), this.getElemQueApunto());
		return ll;
	}

	@Override
	public ElementoSA Copiar(Condicion cond) {
		return null;
	}

}
