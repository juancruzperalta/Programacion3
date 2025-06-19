import java.util.ArrayList;

public class Paquete extends ElementoAbstracto {

	private ArrayList<ElementoAbstracto> elementos;
	public Paquete(int codigoIdentificacion) {
		super(codigoIdentificacion);
		// TODO Auto-generated constructor stub
		elementos = new ArrayList<>();
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
			if(suma > mayor) {
				suma = mayor;
			}
		}
		return suma;
	}
	@Override
	public double montoCobrado() {
		int suma=0;
		for(ElementoAbstracto el: elementos) {
			suma+= el.montoCobrado();
		}
		return suma;
	}

}
