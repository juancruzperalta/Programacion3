package PlataformaStreaming.Condicion;

import PlataformaStreaming.Pelicula;

public class buscarPorDuracionMenor extends Condicion {
	
	private int duracionMax;
	
	public buscarPorDuracionMenor(int duracionMax) {
		this.duracionMax = duracionMax;
	}
	@Override
	public boolean buscarCondicion(Pelicula peli) {
		return peli.getDuracion() < duracionMax;
	}

}
