package SistemaArchivo;

import java.util.ArrayList;

public class Directorio extends Elemento {
	protected ArrayList<Elemento> elems;
	private static int tamDefec=1;
	public Directorio(String nombre, int fechaCreacion) {
		super(nombre, fechaCreacion);
		elems = new ArrayList<>();
	}
	
	public void addElemento(Elemento el) {
		this.elems.add(el);
	}

	public double getTamanio() {
		double tamanio=tamDefec;
		for(Elemento el: elems) {
			tamanio+=el.getTamanio();
		}
		return tamanio;
	}

	public int cantElementosQueTenes() {
		int cantEl=tamDefec;
		for(Elemento el: elems) {
			cantEl+=el.cantElementosQueTenes();
		}
		return cantEl;		
	}
	
	
	

	
}
