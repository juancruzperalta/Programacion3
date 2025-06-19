import java.util.ArrayList;

public class Paquete extends ElementoAlquiler {
	private ArrayList<ElementoAlquiler> elementos;
	public Paquete(int codigo) {
		super(codigo);
		elementos = new ArrayList<>();
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
	public int antiguedad() {
		int suma=0;
		for(ElementoAlquiler el: elementos) {
			int mayor = el.antiguedad();
			if(mayor > suma) {
				suma=mayor;
			}
		}
		return suma;
	}



	@Override
	public double calcularCosto() {
		int suma=0;
		for(ElementoAlquiler el: elementos) {
			suma+= el.calcularCosto();
		}
		return suma;
	}

}
