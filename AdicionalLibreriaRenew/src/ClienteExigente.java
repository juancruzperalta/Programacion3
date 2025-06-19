
public class ClienteExigente extends Cliente {

	public ClienteExigente(String nombre, String apellido, int dni, int direccion, double descuento) {
		super(nombre, apellido, dni, direccion, descuento);
	}
	
	public boolean gustaPorAutorYGenero(Producto pp) {
		boolean gusta= super.teGusta(pp);
		if(gusta) {
			for(int i=0; i<generosFav.size(); i++) {
				if(pp.getGeneros().contains(generosFav.get(i))) {
					return true;
				}
			}
		}
		return false;
	}

}
