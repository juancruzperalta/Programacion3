package SistemaArchivo.Condicion;

import SistemaArchivo.Elemento;

public class CondicionPorNombre extends Condicion {
	private String nombreQueBusco;
	
	
	public CondicionPorNombre(String nombreQueBusco) {
		super();
		this.nombreQueBusco = nombreQueBusco;
	}


	public String getNombreQueBusco() {
		return nombreQueBusco;
	}


	public void setNombreQueBusco(String nombreQueBusco) {
		this.nombreQueBusco = nombreQueBusco;
	}


	@Override
	public boolean filtrar(Elemento em) {
		return em.getNombre().contains(nombreQueBusco);
	}

}
