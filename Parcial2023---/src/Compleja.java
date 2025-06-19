import java.util.ArrayList;

public class Compleja extends Compuesto {

	public Compleja(String nombre) {
		super(nombre);
	}

	@Override
	public int cantEmpleadosAfectados() {
		int suma=0;
		for(Presupuesto pp: presupuestos) {
			int mayor = pp.cantEmpleadosAfectados();
			if(mayor > suma) {
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

	@Override
	public ArrayList<String> matQueRequiero() {
		ArrayList<String> res = new ArrayList<>();
		for(Presupuesto pp: presupuestos) {
			ArrayList<String> aux = pp.matQueRequiero();
			for(String au: aux) {
				if(!res.contains(au)) {
					res.addAll(aux);
				}
			}
		}
		return res;
	}

}
