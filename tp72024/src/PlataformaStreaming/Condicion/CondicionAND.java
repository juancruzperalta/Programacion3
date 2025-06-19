package PlataformaStreaming.Condicion;

import PlataformaStreaming.Pelicula;

public class CondicionAND extends Condicion {
	
	private Condicion cond1, cond2;
	
	
	public CondicionAND(Condicion cond1, Condicion cond2) {
		this.cond1 = cond1;
		this.cond2 = cond2;
	}
	@Override
	public boolean buscarCondicion(Pelicula peli) {
		return cond1.buscarCondicion(peli) && cond2.buscarCondicion(peli);
	}

}
