import java.util.ArrayList;

public class TaeraAvanzada extends Compuesta {

	public TaeraAvanzada(String nombre) {
		super(nombre);
	}

	@Override
	public int tiempoEstimado() {
		int suma =0;
		for(Presupuesto pp: elems) {
			int mayor = pp.tiempoEstimado();
			if(suma > mayor) {
				suma = pp.tiempoEstimado();
			}
		}
		return suma;
	}

	@Override
	public int empleadosAfectados() {
		int suma=0;
		for(Presupuesto pp: elems) {
			suma += pp.empleadosAfectados();
		}
		return suma;
	}

	@Override
	public ArrayList<String> matRequeridos() {
		ArrayList<String> copia = new ArrayList<>();
		
		for(Presupuesto pp: elems) {
			copia.addAll(pp.matRequeridos());
		}
		return copia;
	}

}
