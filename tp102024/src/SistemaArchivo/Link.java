package SistemaArchivo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import SistemaArchivo.Condiciones.Condicion;

public class Link extends ElementoSA{
	ElementoSA elemQueApunto;
	private static int tamanioD = 1;
	
	public Link(String nombre, int fechaCreacion, ElementoSA elem) {
		super(nombre, fechaCreacion);
		elemQueApunto = elem;
	}

	public ElementoSA getElemQueApunto() {
		return elemQueApunto;
	}

	public void setElemQueApunto(ElementoSA elemQueApunto) {
		this.elemQueApunto = elemQueApunto;
	}

	@Override
	public double getTamanio() {
		return tamanioD;
	}

	@Override
	public ArrayList<ElementoSA> buscar(Condicion cond, Comparator<ElementoSA> comp) {
		ArrayList<ElementoSA> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}
//Un link cumple con el criterio de búsqueda por sí mismo, sin tener en cuenta el elemento que 
//	apunta.

	
	
}
