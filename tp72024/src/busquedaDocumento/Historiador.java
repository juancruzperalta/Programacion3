package busquedaDocumento;

import java.util.ArrayList;

import busquedaDocumento.Condiciones.Condicion;

public class Historiador {
	private ArrayList<Documento> documentos;
	
	public Historiador() {
		documentos = new ArrayList<>();
	}
	
	public void addDocumento(Documento dd) {
		documentos.add(dd);
	}
	
	public ArrayList<Documento> buscarDocumento(Condicion cond){
		ArrayList<Documento> auxD = new ArrayList<>();
		for(Documento doc: documentos) {
			if(cond.cumple(doc)) {
				auxD.add(doc);
			}
		}
		return auxD;
	}
}
