import java.util.ArrayList;

public class Directorio extends ElementoSA {
	private ArrayList<ElementoSA> elems;
	
	
	public Directorio(String nombre, int fechaCreacion) {
		super(nombre, fechaCreacion);
		elems = new ArrayList<>();
	}

	public void addElemento(ElementoSA el) {
		if(!elems.contains(el)) {
			elems.add(el);
		}
	}
	
	public int getTamanio() {
			int suma=0;
		for(ElementoSA el: elems) {
			suma += el.getTamanio();
		}
		return suma;
	}

	@Override
	public int cantElementos() {
		int suma=0;
		for(ElementoSA el: elems) {
			suma+= el.cantElementos();
		}
		return suma;
	}
	
}
