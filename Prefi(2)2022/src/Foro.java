import java.util.ArrayList;

public class Foro extends TemaGenerico {
	private ArrayList<TemaGenerico> temas;
	
	
	public Foro() {
		super();
		temas= new ArrayList<>();
	}
	public void addElemento(TemaGenerico tt) {
		temas.add(tt);
	}
	
	@Override
	public String ejeTematico() {
		if(temas.size()>0) {
			int ultpos = temas.size()-1;
			return temas.get(ultpos).ejeTematico();
		}
		return null;
	}

	@Override
	public ArrayList<String> palabrasClave() {
		ArrayList<String> res = new ArrayList<>();
		for(TemaGenerico tt: temas) {
			ArrayList<String> aux = tt.palabrasClave();
			for(String au: aux) {
				if(!tt.palabrasClave().contains(au)) {
					res.addAll(aux);
				}
			}
		}
		return res;
	}


	@Override
	public int cantTemas(Condicion cond) {
		int suma=0;
		for(TemaGenerico tt: temas) {
			suma += tt.cantTemas(cond);
		}
		return suma;
	}


	@Override
	public TemaGenerico copiar(Condicion cond) {
		Foro ff = new Foro();
		for(TemaGenerico tt: temas) {
			TemaGenerico copia = tt.copiar(cond);
			if(copia != null) {
				ff.addElemento(copia);
			}
		}
		return ff;
		
	}

}
