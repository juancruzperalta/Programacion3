import java.util.ArrayList;

public class TareaCompleja extends Compuesta{
	
	
	public TareaCompleja(String nombre) {
		super(nombre);
	}

	@Override
	public int tiempoEstimado() {
		int tiempoEs=0;
		for(Presupuesto pp: elems) {
			tiempoEs += pp.tiempoEstimado();
		}
		return tiempoEs;
	}

	@Override
	public int empleadosAfectados() {
		int suma=0;
		for(Presupuesto pp: elems) {
			int mayor = pp.empleadosAfectados();
			if(suma > mayor) {
				suma = pp.empleadosAfectados();
			}
		}
		return suma;
	}

	@Override
	public ArrayList<String> matRequeridos() {
		ArrayList<String> aux = new ArrayList<>();
		for(Presupuesto pp: elems) {
			for(String dd: aux) {
				if(!pp.matRequeridos().contains(dd)) {
					aux.addAll(pp.matRequeridos());
				}
			}
		}
		return aux;
	}

}
