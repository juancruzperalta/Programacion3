package SistemaArchivo.Condiciones;

import SistemaArchivo.ElementoSA;

public class NombreContenido extends Condicion {
	private String nom;
	
	public NombreContenido(String n) {
		this.nom = n;
	}
	@Override
	public boolean cumple(ElementoSA elem) {
		return elem.getNombre().contains(nom);
	}

}
