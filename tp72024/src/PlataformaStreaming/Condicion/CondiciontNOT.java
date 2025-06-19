package PlataformaStreaming.Condicion;

import PlataformaStreaming.Pelicula;

public class CondiciontNOT extends Condicion {
	
	private Condicion cond1;
	
	public CondiciontNOT(Condicion cond1) {
		this.cond1 = cond1;
	}
	
	@Override
	public boolean buscarCondicion(Pelicula peli) {
		return !cond1.buscarCondicion(peli);
	}

}
