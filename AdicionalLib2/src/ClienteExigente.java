
public class ClienteExigente extends Cliente {

	public ClienteExigente(String nombre, String apellido, int dni, int direccion) {
		super(nombre, apellido, dni, direccion);
	}
	
	public boolean gustaPorAutorYGenero(Producto pp) {
		boolean meGustaAutor = super.teGusta(pp);
		if(meGustaAutor) {
			for(int i=0; i<generosFav.size(); i++) {
				if(pp.obtenerGeneros().contains(generosFav.get(i))) {
					return true;
				}
			}
		}
		return false;
	}

}
