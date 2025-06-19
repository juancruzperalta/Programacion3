import java.util.ArrayList;

public class Paquete extends ElementoAbstracto {
	private ArrayList<ElementoAbstracto> elementos;
	
	
	public Paquete(int codigo) {
		super(codigo);
		
		elementos = new ArrayList<>();
	}
	
	public void addElemento(ElementoAbstracto el) {
		elementos.add(el);
	}

	@Override
	public int getValor() {
		int suma=0;
		for(ElementoAbstracto el: elementos) {
			suma += el.getValor();
		}
		return suma;
	}

	@Override
	public int getAntiguedad() {
		int suma=0;
		for(ElementoAbstracto el: elementos) {
			int mayor = el.getAntiguedad();
			if(mayor > suma) {
				suma = mayor;
			}
		}
		return suma;
	}

	@Override
	public double getCosto() {
		int suma=0;
		for(ElementoAbstracto el: elementos) {
			suma += el.getCosto();
		}
		return suma;
	}

}
