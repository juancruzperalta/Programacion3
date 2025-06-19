import java.util.ArrayList;

public class TareaAvanzada extends Compuesto {

	public TareaAvanzada(String nombre) {
		super(nombre);
	}

	@Override
	public ArrayList<String> getMateriales() {
		ArrayList<String> aux = new ArrayList<>();
		for(Presupuesto pp: elementos) {
			aux.addAll(pp.getMateriales());
		}
		return aux;
	}

	@Override
	public int getCantEmpleados() {
		int suma=0;
		for(Presupuesto pp: elementos) {
			suma+= pp.getCantEmpleados();
		}
		return suma;
	}

	@Override
	public int getTiempoEstimado() {
		int suma=0;
		for(Presupuesto pp: elementos) {
			int mayor = pp.getTiempoEstimado();
			if(mayor > suma) {
				suma = mayor;
			}
		}
		return suma;
		
	}

}
