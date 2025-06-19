import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PaqueteFestivo extends ElementoAlquiler {
	private ArrayList<ElementoAlquiler> elementos;
	
	
	
	public PaqueteFestivo(int codigo) {
		super(codigo);
		elementos = new ArrayList<>();
	}
	
	public void addElemento(ElementoAlquiler ee) {
		elementos.add(ee);
	}

	@Override
	public int getValor() {
		int suma=0;
		for(ElementoAlquiler el: elementos) {
			suma += el.getValor();
		}
		return suma;
	}

	@Override
	public int getAntiguedad() {
		int suma=0;
		for(ElementoAlquiler el: elementos) {
			int mayor = el.getAntiguedad();
			if(mayor > suma) {
				suma = mayor;
			}
		}
		return suma;
	}

	public ArrayList<Elemento> buscar(Condicion cond,Comparator<Elemento> orden){
		ArrayList<Elemento> aux = new ArrayList<>();
		for(ElementoAlquiler el: elementos) {
			aux.addAll(el.buscar(cond,orden));
		}
		Collections.sort(aux, orden);
		return aux;
	}
}
