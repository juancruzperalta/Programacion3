package SistemaArchivo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import SistemaArchivo.Condiciones.Condicion;

public class Archivo extends ElementoSA{
	private int tamanio;
	public Archivo(String nombre, int fechaCreacion, int tamanio) {
		super(nombre, fechaCreacion);
		this.tamanio = tamanio;
	}
	@Override
	public double getTamanio() {
		return tamanio;
	}
	@Override
	public ArrayList<ElementoSA> buscar(Condicion cond, Comparator<ElementoSA> comp) {
		ArrayList<ElementoSA> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}


}
