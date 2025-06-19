package SistemaArchivo.Condicion;

import SistemaArchivo.Elemento;

public class CondicionPorTamanio extends Condicion {
	private int tamanioMaximo;
	
	
	public CondicionPorTamanio(int tamanioMaximo) {
		super();
		this.tamanioMaximo = tamanioMaximo;
	}


	public int getTamanioMaximo() {
		return tamanioMaximo;
	}


	public void setTamanioMaximo(int tamanioMaximo) {
		this.tamanioMaximo = tamanioMaximo;
	}


	@Override
	public boolean filtrar(Elemento em) {
		return em.tamanio() < tamanioMaximo;
	}

}
