import java.util.ArrayList;

public class Compleja extends Compuesta {

	public Compleja(String nombre) {
		super(nombre);
	}

	@Override
	public ArrayList<String> matRequeridos() {
		ArrayList<String> aux = new ArrayList<>();
		for(Presupuesto pp: presupuestos) {
			for(String au: aux) {
				if(!pp.matRequeridos().contains(au)) {
					aux.add(au);
				}
			}
		}
		return aux;
	}

	@Override
	public int cantEmpleadosAfectados() {
		int suma=0;
		for(Presupuesto pp: presupuestos) {
			int mayor = pp.cantEmpleadosAfectados();
			if(suma > mayor) {
				suma = mayor;
			}
		}
		return suma;
	}

	@Override
	public int tiempoEstimado() {
		int suma=0;
		for(Presupuesto pp: presupuestos) {
			suma += pp.tiempoEstimado();
		}
		return suma;
	}

}
