import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Archivo extends ElementoSA {
	private double tamanio;
	public Archivo(String nombre, int tamanio) {
		super(nombre, LocalDate.now());
		this.tamanio =tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public double getTamanio() {
		return tamanio;
	}

	@Override
	public ArrayList<Archivo> buscar(Condicion cond, Comparator<Archivo> orden) {
		ArrayList<Archivo> arch = new ArrayList<>();
		if(cond.cumple(this)) {
			arch.add(this);
		}
		Collections.sort(arch, orden);
		return arch;
	}

	@Override
	public ElementoSA Copiar() {
		Archivo aa = new Archivo(this.getNombre(), (int) this.getTamanio());
		return aa;
	}

	@Override
	public ElementoSA Copiar(Condicion cond) {
		if(cond.cumple(this)) {
			return this.Copiar();
		}
		return null;
	}

}
