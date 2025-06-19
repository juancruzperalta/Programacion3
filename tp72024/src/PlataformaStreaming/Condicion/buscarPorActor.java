package PlataformaStreaming.Condicion;

import PlataformaStreaming.Pelicula;

public class buscarPorActor extends Condicion {
	
	private String actor;
	
	public buscarPorActor(String actor) {
		this.actor = actor;
	}

	@Override
	public boolean buscarCondicion(Pelicula peli) {
		return peli.tenesEsteActor(actor);
	}

}
