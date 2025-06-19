package SistemaArchivo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import SistemaArchivo.Condiciones.Condicion;

public class Directorio extends ElementoSA{
	
	protected ArrayList<ElementoSA> elems;
	
	public Directorio(String nombre, int fechaCreacion) {
		super(nombre, fechaCreacion);
		elems = new ArrayList<>();
	}

	public void addElemento(ElementoSA elem) {
		if(!elems.contains(elem)) {			
			this.elems.add(elem);
		}
	}
	
	@Override
	public double getTamanio() {
		int suma=0;
		for(ElementoSA ele: elems) {
			suma += ele.getTamanio();
		}
		return suma;
	}

	@Override
	public ArrayList<ElementoSA> buscar(Condicion cond, Comparator<ElementoSA> comp) {
		ArrayList<ElementoSA> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}
		for(ElementoSA el: elems) {
			aux.addAll(el.buscar(cond, comp));
		}
		Collections.sort(aux, comp);
		return aux;
	}
	
}
