import java.util.ArrayList;

public class TareaCompleja extends Compuesto {

	public TareaCompleja(String nombre) {
		super(nombre);
	}

	@Override
	public ArrayList<String> getMateriales() {
		ArrayList<String> res = new ArrayList<>();
		for(Presupuesto pp: elementos) {
			ArrayList<String> aux = pp.getMateriales();
			for(String au: aux) {
				if(!res.contains(au)) {
					res.addAll(aux);
				}
			}
		}
		return res;
	}

	@Override
	public int getCantEmpleados() {
		int suma=0;
		for(Presupuesto pp: elementos) {
			int mayor = pp.getCantEmpleados();
			if(mayor > suma) {
				suma = mayor;
			}
		}
		return suma;
	}

	@Override
	public int getTiempoEstimado() {
		int suma = 0;
		for(Presupuesto pp: elementos) {
			suma += pp.getTiempoEstimado();
		}
		return suma;
	}


}
