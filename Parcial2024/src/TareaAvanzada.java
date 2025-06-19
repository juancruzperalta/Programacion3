import java.util.ArrayList;

public class TareaAvanzada extends Compuesto {

	public TareaAvanzada(String nombre) {
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
			aux.addAll(pp.cantMateriales());
		}
		return aux;
	}

	@Override
	public int cantDias() {
		int sumaMayor=0;
		int suma=0;
		
		for(Presupuesto pp: elem) {
			sumaMayor = pp.cantDias();
			if(suma > sumaMayor) {
				suma = pp.cantDias();
			}
		}
		return suma;
		
	}

}
