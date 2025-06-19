package PlataformaStreaming.Condicion;

import PlataformaStreaming.Pelicula;

public class buscarPorTitulo extends Condicion {

	protected String titulo;
	
	public buscarPorTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public boolean buscarCondicion(Pelicula peli) {
		return peli.getTitulo().contains(titulo);
	}

}
