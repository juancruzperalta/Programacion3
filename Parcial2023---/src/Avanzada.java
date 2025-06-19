import java.util.ArrayList;

public class Avanzada extends Compuesto {

	public Avanzada(String nombre) {
		super(nombre);
	}

	@Override
	public int cantEmpleadosAfectados() {
		int suma=0;
		for(Presupuesto pp: presupuestos) {
			suma += pp.cantEmpleadosAfectados();
		}
		return suma;
	}

	@Override
	public int tiempoEstimado() {
		int suma=0;
		for(Presupuesto pp: presupuestos) {
			int mayor = pp.tiempoEstimado();
			if(mayor > suma) {
				suma = mayor;
			}
		}
		return suma;
	}

	@Override
	public ArrayList<String> matQueRequiero() {
		ArrayList<String> aux = new ArrayList<>();
		for(Presupuesto pp: presupuestos) {
			aux.addAll(pp.matQueRequiero());
		}
		return aux;
	}

}
