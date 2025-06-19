package PlataformaStreaming.Condicion;

import PlataformaStreaming.Pelicula;

public class buscarPorGenero extends Condicion {

	private String genero;
	
	public buscarPorGenero(String genero) {
		this.genero=genero;
	}
	
	
	@Override
	public boolean buscarCondicion(Pelicula peli) {
		return peli.tenesEsteGenero(genero);
	}

}
