package PlataformaStreaming.Condicion;

import PlataformaStreaming.Pelicula;

public class buscarPorAnioGrabacion extends Condicion {
	private int anio;
	
	public buscarPorAnioGrabacion(int anio) {
		this.anio = anio;
	}
	@Override
	public boolean buscarCondicion(Pelicula peli) {
		return peli.getAnioEstreno() < anio;
	}

}
