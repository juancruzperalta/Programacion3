package CooperativaAgricultores;

public class Pastura extends Cereal{

	int hectMinimasReq;
	
	public Pastura(String nombre, int hectMinimasReqs) {
		super(nombre);
		this.hectMinimasReq=hectMinimasReqs;
	}
	
	public boolean addCereal(Lote lo) {
		boolean acepto = super.addCereal(lo);
		if(acepto) {
			if(hectMinimasReq > lo.getHectareas()) {
				return true;
			}
		}
		return false;
	}

}
