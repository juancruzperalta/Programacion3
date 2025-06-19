package SistemaArchivo.Condicion;

import SistemaArchivo.Elemento;

public class CondicionPorFecha extends Condicion {
	private int fechaLimite;
	
	
	public CondicionPorFecha(int fechaLimite) {
		super();
		this.fechaLimite = fechaLimite;
	}


	@Override
	public boolean filtrar(Elemento em) {
		return em.getFechaCreacion() < fechaLimite;
	}

}
