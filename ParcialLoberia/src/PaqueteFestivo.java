import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PaqueteFestivo extends ElementoPaquete {
	
	private ArrayList<ElementoPaquete> elementos;
	
	public PaqueteFestivo(int codigoIdentificado) {
		super(codigoIdentificado);
		elementos = new ArrayList<>();
	}

	@Override
	public int getValor() {
		int suma=0;
		for(ElementoPaquete el: elementos) {
			suma += el.getValor();
		}
		return suma;
	}

	@Override
	public int antiguedad() {
		int suma=0;
		for(ElementoPaquete el: elementos) {
			int mayor = el.antiguedad();
			if(suma > mayor) {
				suma = mayor;
			}
		}
		return suma;
	}

	@Override
	public ArrayList<Elemento> buscar(Condicion cond, Comparator<Elemento> orden) {
		ArrayList<Elemento> aux = new ArrayList<>();
		for(ElementoPaquete el: elementos) {
			aux.addAll(el.buscar(cond,orden));
		}
		Collections.sort(aux, orden);
		return aux;
	}


}
