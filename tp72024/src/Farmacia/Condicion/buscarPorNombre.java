package Farmacia.Condicion;

import Farmacia.Medicamento;

public class buscarPorNombre extends Condicion {
	
	private String nombre;
	
	public buscarPorNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public boolean filtrar(Medicamento mm) {
		return mm.getNombreMed().contains(nombre);
	}

}
