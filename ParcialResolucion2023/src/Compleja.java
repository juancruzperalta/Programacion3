import java.util.ArrayList;

public class Compleja extends Compuesta {

	
	public Compleja(String nombre) {
		super(nombre);
	}

	@Override
	public ArrayList<String> matQueRequiero() {
		ArrayList<String> aux = new ArrayList<>();
		for(Presupuesto pp: elems) {
			for(String au: aux) {
				if(!pp.matQueRequiero().contains(au)){
					aux.addAll(pp.matQueRequiero());
				}
			}
		}
		return aux;
	}

	@Override
	public int empleadosAfectados() {
		int suma = 0;
		for(Presupuesto pp: elems) {
			int mayor = pp.tiempoEstimado();
			if(suma > mayor) {
				suma = pp.tiempoEstimado();
			}
		}
		return suma;
	}

	@Override
	public int tiempoEstimado() {
		int suma = 0;
		for(Presupuesto pp: elems) {
			suma += pp.tiempoEstimado();
		}
		return suma;
	}

}
