import java.util.ArrayList;

public class Avanzada extends Compuesta {
	
	public Avanzada(String nombre) {
		super(nombre);
	}

	@Override
	public ArrayList<String> matQueRequiero() {
		ArrayList<String> aux = new ArrayList<>();
		for(Presupuesto pp: elems) {
			aux.addAll(pp.matQueRequiero());
		}
		return aux;
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
	public int tiempoEstimado() {
		int suma=0;
		for(Presupuesto pp: elems) {
			int mayor = pp.tiempoEstimado();
			if(suma > mayor) {
				suma  = pp.tiempoEstimado();
			}
		}
		return suma;
	}

}
