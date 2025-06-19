package Farmacia.Condicion;

import Farmacia.Medicamento;

public class buscarPorPrecio extends Condicion {
	
	private int precioLimite;
	
	public buscarPorPrecio(int precioLimite) {
		this.precioLimite = precioLimite;
	}
	@Override
	public boolean filtrar(Medicamento mm) {
		return mm.getPrecio() <= precioLimite;
	}

}
