package SistemaArchivo;

import java.util.ArrayList;

import SistemaArchivo.Condicion.Condicion;

public class Directorio extends Elemento{
	ArrayList<Elemento> elementos; //Aca estan los archivos, y subdirectorios.
	public Directorio(String nombre, int fechaCreacion) {
		super(nombre, fechaCreacion);
		elementos = new ArrayList<>();
	}
	@Override
	public int cantElementos() {
		int cantElem = 0;
		for(Elemento elems: elementos) {
			cantElem += elems.cantElementos();
		}
		return cantElem;
	}
	@Override
	public double tamanio() {
		double valor=0;
		for(Elemento elems: elementos) {
			valor +=elems.tamanio();
		}
		return valor;
	}
	
	public void addElemento(Elemento el) {
		if(!elementos.contains(el)) {
			elementos.add(el);
		}
	}
	
	public ArrayList<Elemento> buscarElemento(Condicion cond){
		ArrayList<Elemento> aux = new ArrayList<>();
		for(Elemento els: elementos) {
			if(cond.filtrar(els)) {
				aux.add(els);
			}
		}
		return aux;
	}

}
