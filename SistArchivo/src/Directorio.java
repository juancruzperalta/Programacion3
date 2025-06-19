import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Directorio extends ElementoSA {
	
	private ArrayList<ElementoSA> elems;
	
	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha);
		
	}
	public void addElemento(ElementoSA el) {
		this.elems.add(el);
	}
	@Override
	public double getTamanio() {
		int suma=0;
		for(ElementoSA el: elems) {
			suma += el.getTamanio();
		}
		return suma;
	}

	@Override
	public ArrayList<Archivo> buscar(Condicion cond, Comparator<Archivo> orden) {
		ArrayList<Archivo> aux = new ArrayList<>();
		for(ElementoSA hijo: elems) {
			aux.addAll(hijo.buscar(cond, orden));
		}
		Collections.sort(aux, orden);
		return aux;
	}

	@Override
	public ElementoSA Copiar() {
		Directorio copia = new Directorio(this.getNombre(), this.getFechaCreacion());
		for(ElementoSA hijo: elems) {
			copia.addElemento(hijo.Copiar());
		}
		return copia;
	}

	@Override
	public ElementoSA Copiar(Condicion cond) {
		Directorio copia = new Directorio(this.getNombre(), this.getFechaCreacion());
		for(ElementoSA hijo: elems) {
			copia.addElemento(hijo.Copiar(cond));
		}

		return copia;
	}

	


	
	

}
