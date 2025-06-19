package busquedaDocumento.Condiciones;

import busquedaDocumento.Documento;

public class CondicionNOT extends Condicion {
	private Condicion cond1;
	
	public CondicionNOT(Condicion cond1) {
		this.cond1 = cond1;
	}
	@Override
	public boolean cumple(Documento doc) {
		return !cond1.cumple(doc);
	}

}
//d) Todos los documentos que no contengan ninguna palabra clave.
