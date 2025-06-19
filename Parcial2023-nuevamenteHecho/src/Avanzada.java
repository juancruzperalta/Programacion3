import java.util.ArrayList;

public class Avanzada extends Compuesta {

	public Avanzada(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<String> matRequeridos() {
		ArrayList<String> aux = new ArrayList<>();
		for(Presupuesto pp: presupuestos) {
			aux.addAll(pp.matRequeridos());
		}
		return aux;
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
			if(suma > mayor) {
				suma = mayor;
			}
		}
		return suma;
	}

}
