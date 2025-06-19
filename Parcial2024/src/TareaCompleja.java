import java.util.ArrayList;

public class TareaCompleja extends Compuesto{

	public TareaCompleja(String nombre) {
		super(nombre);

	}


	@Override
	public int getCantEmpleados() {
		int suma=0;
		for(Presupuesto pp: elem) {
			suma += pp.getCantEmpleados();
		}
		return suma;
	}

	@Override
	public ArrayList<String> cantMateriales() {
		ArrayList<String> aux = new ArrayList<>();
		for(Presupuesto pp: elem) {
			for(String au: aux) {
				if(!aux.contains(au)) {
				
				aux.addAll(pp.cantMateriales());
				}
			}
		}
		return aux;
		
	}

	@Override
	public int cantDias() {
		int suma=0;
		
		for(Presupuesto pp: elem) {
			suma+= pp.cantDias();
		}
		return suma;
	}


}
