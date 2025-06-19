package SistemaArchivo;

import java.util.ArrayList;
import java.util.Comparator;

import SistemaArchivo.Condiciones.Condicion;

public class Comprimido extends Directorio{
	private int compresion;
	public Comprimido(String nombre, int fechaCreacion, int compresion) {
		super(nombre, fechaCreacion);
		this.compresion = compresion;
	}
	public int getCompresion() {
		return compresion;
	}
	public void setCompresion(int compresion) {
		this.compresion = compresion;
	}

	public double getTamanio() {
		return super.getTamanio()*compresion;
	}
	
	
	public ArrayList<ElementoSA> buscar(Condicion cond, Comparator<ElementoSA> comp) {
		ArrayList<ElementoSA> aux = new ArrayList<>();
		for(ElementoSA el: elems) {
			if(cond.cumple(el)) {
				aux.add(this);
			}
		}
		return aux;
	}
	
}
