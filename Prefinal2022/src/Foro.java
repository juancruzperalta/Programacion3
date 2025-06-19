import java.util.ArrayList;

public class Foro extends Elemento {
	private ArrayList<Elemento> elementos;
	
	
	public Foro() {
		super();
		this.elementos = elementos;
	}
	
	public void addElemento(Elemento ee) {
		if(!elementos.contains(ee)) {
			elementos.add(ee);
		}
	}

	@Override
	public ArrayList<String> palabrasClave() {
		ArrayList<String> aux = new ArrayList<>();
		for(Elemento el: elementos) {
			for(String au: aux) {
				if(!el.palabrasClave().contains(aux)) {
					aux.addAll(el.palabrasClave());
				}
			}
		}
		return aux;
	}

	@Override
	public String ejeTematico() {
		String ultimo="";
			int ultimaPos = elementos.size()-1;
			ultimo= elementos.get(ultimaPos).ejeTematico();
			return ultimo;
		}

	@Override
	public Elemento copiar(Condicion cond) {
		Foro f1= new Foro();
		 boolean encontro = false;
		 for(Elemento ff: elementos) {
			 Elemento copia = ff.copiar(cond);
		       if (copia!=null) {
		    		   f1.addElemento(copia);
		    		   encontro = true;
		         }
	      }
	      
		 if (!encontro) {
	    	   return null;
	       }else {
	    	  return f1;
	       }
			
	}
	
	public int buscar(Condicion cond){
		int suma=0;
		for(Elemento ff:elementos) {
			suma+= ff.buscar(cond);
		}
		return suma;
	}

}
