import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PaqueteFestivo extends ElementoAlquiler {
	private ArrayList<ElementoAlquiler> elementos;
	
	

	public PaqueteFestivo(int codigo) {
		super(codigo);
		elementos = new ArrayList<>();
	}
	
	public void addElemento(ElementoAlquiler el) {
		elementos.add(el);
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
		int antiguedad=0;
		for(ElementoAlquiler el: elementos) {
			int mayor = el.getAntiguedad();
			if(mayor > antiguedad) {
				antiguedad = mayor;
			}
		}
		return antiguedad;
	}

	@Override
	public ArrayList<Elemento> buscar(Condicion cond, Comparator<Elemento> orden) {
		ArrayList<Elemento> aux = new ArrayList<>();
		for(ElementoAlquiler el: elementos) {
			aux.addAll(el.buscar(cond, orden));
		}
		Collections.sort(aux, orden);
		return aux;
	}

}
