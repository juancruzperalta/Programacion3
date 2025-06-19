package busquedaDoc;

import java.util.ArrayList;

public class Historiador {
	private ArrayList<Documento> docums;
	
	public Historiador() {
		docums = new ArrayList<>();
	}
	
	public ArrayList<Documento> buscar(Condicion cond){
		ArrayList<Documento> aux = new ArrayList<>();
		for(Documento doc: docums) {
			if(cond.cumple(doc)) {
				aux.add(doc);
			}
		}
		return aux;
	}
}
